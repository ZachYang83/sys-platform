package com.gpzi.gpplatform.pop_perceive.controller;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.pop_perceive.ato.Ids;
import com.gpzi.gpplatform.pop_perceive.entity.PzLiveGrid;
import com.gpzi.gpplatform.pop_perceive.entity.PzWorkGrid;
import com.gpzi.gpplatform.pop_perceive.service.PzLiveGridService;
import com.gpzi.gpplatform.pop_perceive.service.PzWorkGridService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gpzi
 * @since 2022-10-27
 */
@RestController
@RequestMapping("/pop_perceive/pz-work-grid")
public class PzWorkGridController {

    @Autowired
    PzWorkGridService pzWorkGridService;

    @PostMapping("/getWorkPop")
    public Result getWorkPopByIds(@RequestBody String ids){
        QueryWrapper<PzWorkGrid> wrapper = new QueryWrapper<>();
        Ids idsObj = JSONObject.parseObject(ids, Ids.class);
        String ids_string =  idsObj.getIds();
        String ids_string2 = ids_string.substring(1,ids_string.length()-1);
        String[] arr = ids_string2.split(",");
        Object[] ids_list = Arrays.stream(arr).toArray();
        wrapper.in("id",ids_list);
        wrapper.select("sum(beijing) as beijing,sum(tianjin) as tianjin,sum(hebei) as hebei,sum(shanxi) as shanxi,sum(neimenggu) as neimenggu,sum(liaoning) as liaoning,sum(jilin) as jilin,sum(heilongjia) as heilongjia,sum(shanghai) as shanghai,sum(jiangsu) as jiangsu,sum(zhejiang) as zhejiang,sum(anhui) as anhui,sum(fujian) as fujian,sum(jiangxi) as jiangxi,sum(shandong) as shandong,sum(henan) as henan,sum(hubei) as hubei,sum(hunan) as hunan,sum(guangdong) as guangdong,sum(guangxi) as guangxi,sum(hainan) as hainan,sum(chongqing) as chongqing,sum(sichuan) as sichuan,sum(guizhou) as guizhou,sum(yunnan) as yunnan,sum(xizang) as xizang,sum(shannxi) as shannxi,sum(gansu) as gansu,sum(qinghai) as qinghai,sum(ningxia) as ningxia,sum(xinjiang) as xinjiang,sum(nl020) as nl020,sum(nl2030) as nl2030,sum(nl3040) as nl3040,sum(nl4050) as nl4050,sum(nl5060) as nl5060,sum(nl60over) as nl60over,sum(jiaotong) as jiaotong,sum(zhusu) as zhusu,sum(xinxi) as xinxi,sum(gonggong) as gonggong,sum(nlmy) as nlmy,sum(zhizao) as zhizao,sum(weisheng) as weisheng,sum(jumin) as jumin,sum(jianzhu) as jianzhu,sum(fangdi) as fangdi,sum(pifa) as pifa,sum(jiaoyu) as jiaoyu,sum(wenhua) as wenhua,sum(shuili) as shuili,sum(dianli) as dianli,sum(kexue) as kexue,sum(zulin) as zulin,sum(jinrong) as jinrong,sum(qita) as qita,sum(chuzhong) as chuzhong,sum(boshi) as boshi,sum(zhuanke) as zhuanke,sum(benke) as benke,sum(xiaoxue) as xiaoxue,sum(gaozhong) as gaozhong,sum(shuoshi) as shuoshi");
        List<PzWorkGrid> PzWorkGridList = pzWorkGridService.list(wrapper);
        return Result.succ(PzWorkGridList);
    }
}

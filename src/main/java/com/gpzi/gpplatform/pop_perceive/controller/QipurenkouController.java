package com.gpzi.gpplatform.pop_perceive.controller;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.pop_perceive.ato.Ids;
import com.gpzi.gpplatform.pop_perceive.entity.GdHj500;
import com.gpzi.gpplatform.pop_perceive.entity.Qipurenkou;
import com.gpzi.gpplatform.pop_perceive.service.GdHj500Service;
import com.gpzi.gpplatform.pop_perceive.service.QipurenkouService;
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
 * @since 2022-09-08
 */
@RestController
@RequestMapping("/pop_perceive/qipu")
public class QipurenkouController {

    @Autowired
    QipurenkouService qipurenkouService;

    @PostMapping("/getPop")
    public Result getPopById(@RequestBody String ids){
        QueryWrapper<Qipurenkou> wrapper = new QueryWrapper<>();
        Ids idsObj = JSONObject.parseObject(ids, Ids.class);
        String ids_string =  idsObj.getIds();
        String ids_string2 = ids_string.substring(1,ids_string.length()-1);
        String[] arr = ids_string2.split(",");
        Object[] ids_list = Arrays.stream(arr).toArray();
        wrapper.in("wgid",ids_list);
        wrapper.select("groupid,sum(shanghai) as shanghai,sum(yunnan) as yunnan,sum(neimenggu) as neimenggu,sum(beijing) as beijing,sum(jilin) as jilin,sum(sichuan) as sichuan,sum(tianjin) as tianjin,sum(ningxia) as ningxia,sum(anhui) as anhui,sum(shandong) as shandong,sum(shanxi) as shanxi,sum(guangdong) as guangdong,sum(guangxi) as guangxi,sum(xinjiang) as xinjiang,sum(jiangsu) as jiangsu,sum(jiangxi) as jiangxi,sum(hebei) as hebei,sum(henan) as henan,sum(zhejiang) as zhejiang,sum(hainan) as hainan,sum(hubei) as hubei,sum(hunan) as hunan,sum(gansu) as gansu,sum(fujian) as fujian,sum(xizang) as xizang,sum(guizhou) as guizhou,sum(liaoning) as liaoning,sum(chongqing) as chongqing,sum(shaanxi) as shaanxi,sum(qinghai) as qinghai,sum(helongjiang) as helongjiang,sum(znl015) as znl015,sum(znl1629) as znl1629,sum(znl3044) as znl3044,sum(znl4559) as znl4559,sum(znl60) as znl60");
        wrapper.groupBy("groupid");
        List<Qipurenkou> qipuList = qipurenkouService.list(wrapper);
        return Result.succ(qipuList);
    }

}

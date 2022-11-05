package com.gpzi.gpplatform.pop_perceive.controller;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.pop_perceive.ato.Ids;
import com.gpzi.gpplatform.pop_perceive.entity.GdHj500;
import com.gpzi.gpplatform.pop_perceive.entity.GdZy500;
import com.gpzi.gpplatform.pop_perceive.service.GdHj500Service;
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
 * @since 2021-04-21
 */
@RestController
@RequestMapping("/pop_perceive/gd-hj500")
public class GdHj500Controller {

    @Autowired
    GdHj500Service gdHj500Service;

    @PostMapping("/getHj")
    public Result getHj(@RequestBody String ids){

        QueryWrapper<GdHj500> wrapper = new QueryWrapper<>();
        Ids idsObj = JSONObject.parseObject(ids, Ids.class);
        String ids_string =  idsObj.getIds();
        String ids_string2 = ids_string.substring(1,ids_string.length()-1);
        String[] arr = ids_string2.split(",");
        Object[] ids_list = Arrays.stream(arr).toArray();
        wrapper.in("UID_500m",ids_list);
        wrapper.select("sb,sum(beijing) as beijing,sum(tianjin) as tianjin,sum(hebei) as hebei,sum(shanxi) as shanxi,sum(neimenggu) as neimenggu,sum(liaoning) as liaoning,sum(jilin) as jilin,sum(heilongjiang) as heilongjiang,sum(shanghai) as shanghai,sum(jiangsu) as jiangsu,sum(zhejiang) as zhejiang,sum(anhui) as anhui,sum(fujian) as fujian,sum(jiangxi) as jiangxi,sum(shandong) as shandong,sum(henan) as henan,sum(hubei) as hubei,sum(hunan) as hunan,sum(guangdong) as guangdong,sum(guangxi) as guangxi,sum(hainan) as hainan,sum(chongqing) as chongqing,sum(sichuan) as sichuan,sum(guizhou) as guizhou,sum(yunnan) as yunnan,sum(xizang) as xizang,sum(SX) as SX,sum(gansu) as gansu,sum(qinghai) as qinghai,sum(ningxia) as ningxia,sum(xinjiang) as xinjiang");
        wrapper.groupBy("sb");
        List<GdHj500> gdHj500List = gdHj500Service.list(wrapper);
        return Result.succ(gdHj500List);
    }

}

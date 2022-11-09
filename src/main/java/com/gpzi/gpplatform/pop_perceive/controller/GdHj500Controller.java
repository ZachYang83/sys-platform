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
        wrapper.select("sb,sum(beijing) /24 as beijing,sum(tianjin) /24 as tianjin,sum(hebei) /24 as hebei,sum(shanxi) /24 as shanxi,sum(neimenggu) /24 as neimenggu,sum(liaoning) /24 as liaoning,sum(jilin) /24 as jilin,sum(heilongjiang) /24 as heilongjiang,sum(shanghai) /24 as shanghai,sum(jiangsu) /24 as jiangsu,sum(zhejiang) /24 as zhejiang,sum(anhui) /24 as anhui,sum(fujian) /24 as fujian,sum(jiangxi) /24 as jiangxi,sum(shandong) /24 as shandong,sum(henan) /24 as henan,sum(hubei) /24 as hubei,sum(hunan) /24 as hunan,sum(guangdong) /24 as guangdong,sum(guangxi) /24 as guangxi,sum(hainan) /24 as hainan,sum(chongqing) /24 as chongqing,sum(sichuan) /24 as sichuan,sum(guizhou) /24 as guizhou,sum(yunnan) /24 as yunnan,sum(xizang) /24 as xizang,sum(SX) /24 as SX,sum(gansu) /24 as gansu,sum(qinghai) /24 as qinghai,sum(ningxia) /24 as ningxia,sum(xinjiang) /24 as xinjiang");
//        wrapper.groupBy("sb");
        List<GdHj500> gdHj500List = gdHj500Service.list(wrapper);
        return Result.succ(gdHj500List);
    }

}

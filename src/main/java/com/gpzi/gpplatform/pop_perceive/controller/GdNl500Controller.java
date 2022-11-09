package com.gpzi.gpplatform.pop_perceive.controller;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.pop_perceive.ato.Ids;
import com.gpzi.gpplatform.pop_perceive.entity.GdHj500;
import com.gpzi.gpplatform.pop_perceive.entity.GdNl500;
import com.gpzi.gpplatform.pop_perceive.service.GdHj500Service;
import com.gpzi.gpplatform.pop_perceive.service.GdNl500Service;
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
 * @since 2021-04-22
 */
@RestController
@RequestMapping("/pop_perceive/gd-nl500")
public class GdNl500Controller {

    @Autowired
    GdNl500Service gdNl500Service;

    @PostMapping("/getNl")
    public Result getNl(@RequestBody String ids) {

        QueryWrapper<GdNl500> wrapper = new QueryWrapper<>();
        Ids idsObj = JSONObject.parseObject(ids, Ids.class);
        String ids_string = idsObj.getIds();
        String ids_string2 = ids_string.substring(1, ids_string.length() - 1);
        String[] arr = ids_string2.split(",");
        Object[] ids_list = Arrays.stream(arr).toArray();
        wrapper.in("UID_500m", ids_list);
        wrapper.select("sb,sum(betw6_11) /24 as betw6_11,sum(betw12_15) /24 as betw12_15,sum(betw16_18) /24 as betw16_18,sum(betw19_22) /24 as betw19_22,sum(betw23_25) /24 as betw23_25,sum(betw26_34) /24 as betw26_34,sum(betw35_45) /24 as betw35_45,sum(betw46_55) /24 as betw46_55,sum(betw56_65) /24 as betw56_65,sum(above65) /24 as above65,sum(total_pop) /24 as total_pop");
//        wrapper.groupBy("sb");
        List<GdNl500> gdHj500List = gdNl500Service.list(wrapper);
        return Result.succ(gdHj500List);
    }

}

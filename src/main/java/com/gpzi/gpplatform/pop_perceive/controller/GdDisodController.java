package com.gpzi.gpplatform.pop_perceive.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.pop_perceive.entity.GdDisod;
import com.gpzi.gpplatform.pop_perceive.service.GdDisodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gpzi
 * @since 2021-05-24
 */
@RestController
@RequestMapping("/pop_perceive/gd-disod")
public class GdDisodController {

    @Autowired
    GdDisodService gdDisodService;

    @GetMapping("/getOOnes")
    public Result getOOnes(String dis){
        QueryWrapper<GdDisod> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("odis",dis);
        queryWrapper.orderByDesc("sum");
        List<GdDisod> gdDisodList = gdDisodService.list(queryWrapper);
        return Result.succ(gdDisodList);
    }

    @GetMapping("/getOOnesByCity")
    public Result getOOnesByCity(String dis){
        QueryWrapper<GdDisod> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("odis",dis);
        queryWrapper.select("dcity,ddis,sum(sum) as sum");
        queryWrapper.groupBy("dcity");
        queryWrapper.orderByDesc("sum");
        List<GdDisod> gdDisodList = gdDisodService.list(queryWrapper);
        return Result.succ(gdDisodList);
    }

    @GetMapping("/getDOnes")
    public Result getDOnes(String dis){
        QueryWrapper<GdDisod> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("ddis",dis);
        queryWrapper.orderByDesc("sum");
        List<GdDisod> gdDisodList = gdDisodService.list(queryWrapper);
        return Result.succ(gdDisodList);
    }

    @GetMapping("/getDOnesByCity")
    public Result getDOnesByCity(String dis){
        QueryWrapper<GdDisod> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("ddis",dis);
        queryWrapper.select("ocity,odis,sum(sum) as sum");
        queryWrapper.groupBy("ocity");
        queryWrapper.orderByDesc("sum");
        List<GdDisod> gdDisodList = gdDisodService.list(queryWrapper);
        return Result.succ(gdDisodList);
    }
}

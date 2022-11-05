package com.gpzi.gpplatform.tra_monitor.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.tra_monitor.entity.TraRelInt;
import com.gpzi.gpplatform.tra_monitor.service.TraRelIntService;
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
 * @since 2021-05-12
 */
@RestController
@RequestMapping("/tra_monitor/tra-rel-int")
public class TraRelIntController {

    @Autowired
    TraRelIntService traRelIntService;

    @GetMapping("/getOOnes")
    public Result getOOnes(String code){
        QueryWrapper<TraRelInt> queryWrapper = new QueryWrapper<>();
        int code_int = Integer.parseInt(code);
        queryWrapper.eq("ocode",code_int);
        queryWrapper.orderByDesc("sum");
        List<TraRelInt> traRelIntList = traRelIntService.list(queryWrapper);
        return Result.succ(traRelIntList);
    }

    @GetMapping("/getOOnesByCity")
    public Result getOOnesByCity(String code){
        QueryWrapper<TraRelInt> queryWrapper = new QueryWrapper<>();
        int code_int = Integer.parseInt(code);
        queryWrapper.eq("ocode",code_int);
        queryWrapper.select("dcity,sum(sum) as sum");
        queryWrapper.groupBy("dcity");
        queryWrapper.orderByDesc("sum");
        List<TraRelInt> traRelIntList = traRelIntService.list(queryWrapper);
        return Result.succ(traRelIntList);
    }

    @GetMapping("/getDOnes")
    public Result getDOnes(String code){
        QueryWrapper<TraRelInt> queryWrapper = new QueryWrapper<>();
        int code_int = Integer.parseInt(code);
        queryWrapper.eq("dcode",code_int);
        queryWrapper.orderByDesc("sum");
        List<TraRelInt> traRelIntList = traRelIntService.list(queryWrapper);
        return Result.succ(traRelIntList);
    }

    @GetMapping("/getDOnesByCity")
    public Result getDOnesByCity(String code){
        QueryWrapper<TraRelInt> queryWrapper = new QueryWrapper<>();
        int code_int = Integer.parseInt(code);
        queryWrapper.eq("dcode",code_int);
        queryWrapper.select("ocity,sum(sum) as sum");
        queryWrapper.groupBy("ocity");
        queryWrapper.orderByDesc("sum");
        List<TraRelInt> traRelIntList = traRelIntService.list(queryWrapper);
        return Result.succ(traRelIntList);
    }

}

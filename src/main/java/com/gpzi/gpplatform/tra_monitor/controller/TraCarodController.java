package com.gpzi.gpplatform.tra_monitor.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.tra_monitor.entity.TraCarod;
import com.gpzi.gpplatform.tra_monitor.service.TraCarodService;
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
 * @since 2021-05-21
 */
@RestController
@RequestMapping("/tra_monitor/tra-carod")
public class TraCarodController {

    @Autowired
    TraCarodService traCarodService;

    @GetMapping("/getOOnes")
    public Result getOOnes(String code){
        QueryWrapper<TraCarod> queryWrapper = new QueryWrapper<>();
        int code_int = Integer.parseInt(code);
        queryWrapper.eq("ocode",code_int);
        queryWrapper.orderByDesc("sum");
        List<TraCarod> traCarodList = traCarodService.list(queryWrapper);
        return Result.succ(traCarodList);
    }

    @GetMapping("/getOOnesByStreet")
    public Result getOOnesByStreet(String code){
        QueryWrapper<TraCarod> queryWrapper = new QueryWrapper<>();
        int code_int = Integer.parseInt(code);
        queryWrapper.eq("ocode",code_int);
        queryWrapper.select("ddis,dstr,sum(sum) as sum");
        queryWrapper.groupBy("ddis");
        queryWrapper.orderByDesc("sum");
        List<TraCarod> traCarodList = traCarodService.list(queryWrapper);
        return Result.succ(traCarodList);
    }

    @GetMapping("/getDOnes")
    public Result getDOnes(String code){
        QueryWrapper<TraCarod> queryWrapper = new QueryWrapper<>();
        int code_int = Integer.parseInt(code);
        queryWrapper.eq("dcode",code_int);
        queryWrapper.orderByDesc("sum");
        List<TraCarod> traCarodList = traCarodService.list(queryWrapper);
        return Result.succ(traCarodList);
    }

    @GetMapping("/getDOnesByStreet")
    public Result getDOnesByStreet(String code){
        QueryWrapper<TraCarod> queryWrapper = new QueryWrapper<>();
        int code_int = Integer.parseInt(code);
        queryWrapper.eq("dcode",code_int);
        queryWrapper.select("odis,ostr,sum(sum) as sum");
        queryWrapper.groupBy("odis");
        queryWrapper.orderByDesc("sum");
        List<TraCarod> traCarodList = traCarodService.list(queryWrapper);
        return Result.succ(traCarodList);
    }

}

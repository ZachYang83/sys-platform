package com.gpzi.gpplatform.pop_perceive.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.pop_perceive.entity.PopRelInt;
import com.gpzi.gpplatform.pop_perceive.service.PopRelIntService;
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
 * @since 2021-05-10
 */
@RestController
@RequestMapping("/pop_perceive/pop-rel-int")
public class PopRelIntController {

    @Autowired
    PopRelIntService popRelIntService;

    @GetMapping("/getOOnes")
    public Result getOOnes(String code){
        QueryWrapper<PopRelInt> queryWrapper = new QueryWrapper<>();
        int code_int = Integer.parseInt(code);
        queryWrapper.eq("ocode",code_int);
        queryWrapper.orderByDesc("sum");
        List<PopRelInt> popRelIntList = popRelIntService.list(queryWrapper);
        return Result.succ(popRelIntList);
    }

    @GetMapping("/getOOnesByCity")
    public Result getOOnesByCity(String code){
        QueryWrapper<PopRelInt> queryWrapper = new QueryWrapper<>();
        int code_int = Integer.parseInt(code);
        queryWrapper.eq("ocode",code_int);
        queryWrapper.select("dcity,sum(sum) as sum");
        queryWrapper.groupBy("dcity");
        queryWrapper.orderByDesc("sum");
        List<PopRelInt> popRelIntList = popRelIntService.list(queryWrapper);
        return Result.succ(popRelIntList);
    }

    @GetMapping("/getDOnes")
    public Result getDOnes(String code){
        QueryWrapper<PopRelInt> queryWrapper = new QueryWrapper<>();
        int code_int = Integer.parseInt(code);
        queryWrapper.eq("dcode",code_int);
        queryWrapper.orderByDesc("sum");
        List<PopRelInt> popRelIntList = popRelIntService.list(queryWrapper);
        return Result.succ(popRelIntList);
    }

    @GetMapping("/getDOnesByCity")
    public Result getDOnesByCity(String code){
        QueryWrapper<PopRelInt> queryWrapper = new QueryWrapper<>();
        int code_int = Integer.parseInt(code);
        queryWrapper.eq("dcode",code_int);
        queryWrapper.select("ocity,sum(sum) as sum");
        queryWrapper.groupBy("ocity");
        queryWrapper.orderByDesc("sum");
        List<PopRelInt> popRelIntList = popRelIntService.list(queryWrapper);
        return Result.succ(popRelIntList);
    }

}

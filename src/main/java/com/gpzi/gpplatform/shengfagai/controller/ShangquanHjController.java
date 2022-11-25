package com.gpzi.gpplatform.shengfagai.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.shengfagai.entity.GongyeyuanHj;
import com.gpzi.gpplatform.shengfagai.entity.ShangquanHj;
import com.gpzi.gpplatform.shengfagai.service.GongyeyuanHjService;
import com.gpzi.gpplatform.shengfagai.service.ShangquanHjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gpzi
 * @since 2022-11-22
 */
@RestController
@RequestMapping("/shengfagai/shangquan-hj")
public class ShangquanHjController {
    @Autowired
    ShangquanHjService ShangquanHjService;

    @GetMapping("/getSqHuji")
    public Result getSqHuji(@RequestParam Integer busId, @RequestParam Integer time){
        QueryWrapper<ShangquanHj> wrapper = new QueryWrapper<>();
        wrapper.eq("time",time).eq("busId",busId);
        wrapper.select("*");
        List<ShangquanHj> shangquanHjList = ShangquanHjService.list(wrapper);
        return Result.succ(shangquanHjList);
    }

}

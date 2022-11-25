package com.gpzi.gpplatform.shengfagai.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.shengfagai.entity.ChangzhuShi;
import com.gpzi.gpplatform.shengfagai.entity.GongyeyuanHj;
import com.gpzi.gpplatform.shengfagai.entity.LiuruHj;
import com.gpzi.gpplatform.shengfagai.service.GongyeyuanHjService;
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
 * @since 2022-11-20
 */
@RestController
@RequestMapping("/shengfagai/gongyeyuan-hj")
public class GongyeyuanHjController {

    @Autowired
    GongyeyuanHjService gongyeyuanHjService;

    @GetMapping("/getGyyHuji")
    public Result getGyyHuji(@RequestParam Integer indId,@RequestParam Integer time){
        QueryWrapper<GongyeyuanHj> wrapper = new QueryWrapper<>();
        wrapper.eq("time",time).eq("indid",indId);
        wrapper.select("*");
        List<GongyeyuanHj> gongyeyuanHjList = gongyeyuanHjService.list(wrapper);
        return Result.succ(gongyeyuanHjList);
    }
}

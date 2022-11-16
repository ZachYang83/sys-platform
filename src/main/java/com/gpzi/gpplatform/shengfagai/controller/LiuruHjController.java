package com.gpzi.gpplatform.shengfagai.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.shengfagai.entity.LiuchuHj;
import com.gpzi.gpplatform.shengfagai.entity.LiuruHj;
import com.gpzi.gpplatform.shengfagai.service.LiuchuHjService;
import com.gpzi.gpplatform.shengfagai.service.LiuruHjService;
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
 * @since 2022-11-16
 */
@RestController
@RequestMapping("/shengfagai/liuru-hj")
public class LiuruHjController {

    @Autowired
    LiuruHjService liuruHjService;

    @GetMapping("/getHuji")
    public Result getHuji(@RequestParam Integer cityid, @RequestParam Integer time){
        QueryWrapper<LiuruHj> wrapper = new QueryWrapper<>();
        wrapper.eq("time",time).eq("cityid",cityid);
        wrapper.select("*");
        List<LiuruHj> liuruHjList = liuruHjService.list(wrapper);
        return Result.succ(liuruHjList);
    }

}

package com.gpzi.gpplatform.shengfagai.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.pop_perceive.entity.PzLiveGrid;
import com.gpzi.gpplatform.pop_perceive.service.PzLiveGridService;
import com.gpzi.gpplatform.shengfagai.entity.LiuchuHj;
import com.gpzi.gpplatform.shengfagai.service.LiuchuHjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gpzi
 * @since 2022-11-15
 */
@RestController
@RequestMapping("/shengfagai/liuchu-hj")
public class LiuchuHjController {

    @Autowired
    LiuchuHjService liuchuHjService;

    @GetMapping("/getHuji")
    public Result getHuji(@RequestParam Integer cityid,@RequestParam Integer time){
        QueryWrapper<LiuchuHj> wrapper = new QueryWrapper<>();
        wrapper.eq("time",time).eq("cityid",cityid);
        wrapper.select("*");
        List<LiuchuHj> liuchuHjList = liuchuHjService.list(wrapper);
        return Result.succ(liuchuHjList);
    }

}

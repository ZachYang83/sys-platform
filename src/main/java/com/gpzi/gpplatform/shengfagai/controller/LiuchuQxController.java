package com.gpzi.gpplatform.shengfagai.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.shengfagai.entity.LiuchuHj;
import com.gpzi.gpplatform.shengfagai.entity.LiuchuQx;
import com.gpzi.gpplatform.shengfagai.service.LiuchuQxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gpzi
 * @since 2022-11-15
 */
@RestController
@RequestMapping("/shengfagai/liuchu-qx")
public class LiuchuQxController {

    @Autowired
    LiuchuQxService liuchuQxService;

    @GetMapping("/getQuxian")
    public Result getQuxian(@RequestParam Integer time,@RequestParam String city){
        QueryWrapper<LiuchuQx> wrapper = new QueryWrapper<>();
        String col = "";
        switch (time){
            case 202201:
                wrapper.select("mon1 as temp , county");
                break;
            case 202202:
                wrapper.select("mon2 as temp , county");
                break;
            case 202203:
                wrapper.select("mon3 as temp , county");
                break;
            case 202204:
                wrapper.select("mon4 as temp , county");
                break;
            case 202205:
                wrapper.select("mon5 as temp , county");
                break;
            case 202206:
                wrapper.select("mon6 as temp , county");
                break;
            case 202207:
                wrapper.select("mon7 as temp , county");
                break;
            case 202208:
                wrapper.select("mon8 as temp , county");
                break;
            case 202209:
                wrapper.select("mon9 as temp , county");
                break;
        }
        wrapper.eq("city",city);
        List<LiuchuQx> liuchuQxList = liuchuQxService.list(wrapper);
        return Result.succ(liuchuQxList);
    }
}

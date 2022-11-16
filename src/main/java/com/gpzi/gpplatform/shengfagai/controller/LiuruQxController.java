package com.gpzi.gpplatform.shengfagai.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.shengfagai.entity.LiuchuQx;
import com.gpzi.gpplatform.shengfagai.entity.LiuruQx;
import com.gpzi.gpplatform.shengfagai.service.LiuchuQxService;
import com.gpzi.gpplatform.shengfagai.service.LiuruQxService;
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
@RequestMapping("/shengfagai/liuru-qx")
public class LiuruQxController {

    @Autowired
    LiuruQxService liuruQxService;

    @GetMapping("/getQuxian")
    public Result getQuxian(@RequestParam Integer time, @RequestParam String city){
        QueryWrapper<LiuruQx> wrapper = new QueryWrapper<>();
        switch (time){
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
            case 202210:
                wrapper.select("mon10 as temp , county");
                break;
        }
        wrapper.eq("city",city);
        List<LiuruQx> liuruQxList = liuruQxService.list(wrapper);
        return Result.succ(liuruQxList);
    }

}

package com.gpzi.gpplatform.shengfagai.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.shengfagai.entity.ChangzhuShi;
import com.gpzi.gpplatform.shengfagai.entity.LiuruHj;
import com.gpzi.gpplatform.shengfagai.service.ChangzhuShiService;
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
@RequestMapping("/shengfagai/changzhu-shi")
public class ChangzhuShiController {

    @Autowired
    ChangzhuShiService changzhuShiService;

    @GetMapping("/getChangzhu")
    public Result getChangzhu(@RequestParam Integer month){
        QueryWrapper<ChangzhuShi> wrapper = new QueryWrapper<>();
        wrapper.select("*");
        wrapper.eq("month",month);
        List<ChangzhuShi> changzhuShiList = changzhuShiService.list(wrapper);
        return Result.succ(changzhuShiList);
    }

}

package com.gpzi.gpplatform.pop_perceive.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.pop_perceive.entity.CitysPop;
import com.gpzi.gpplatform.pop_perceive.service.CitysPopService;
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
 * @since 2021-04-30
 */
@RestController
@RequestMapping("/pop_perceive/citys-pop")
public class CitysPopController {

    @Autowired
    CitysPopService citysPopService;

    @GetMapping("/all")
    public Result getAll(String time){
        String str = "time" + Integer.parseInt(time);
        QueryWrapper<CitysPop> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("city",str);
        queryWrapper.orderByDesc(str);
        List<CitysPop> citysPopList = citysPopService.list(queryWrapper);
        return Result.succ(citysPopList);
    }

}

package com.gpzi.gpplatform.house_info.controller;


import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.house_info.entity.Secondhouse;
import com.gpzi.gpplatform.house_info.service.SecondhouseService;
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
 * @since 2021-05-22
 */
@RestController
@RequestMapping("/house_info/secondhouse")
public class SecondhouseController {

    @Autowired
    SecondhouseService secondhouseService;

    @GetMapping("/all")
    public Result getAll(){
        List<Secondhouse> secondhouseList = secondhouseService.list();
        return Result.succ(secondhouseList);
    }

}

package com.gpzi.gpplatform.public_info.controller;


import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.public_info.entity.PubinfoCity;
import com.gpzi.gpplatform.public_info.service.PubinfoCityService;
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
 * @since 2021-04-14
 */
@RestController
@RequestMapping("/public_info/pubinfo-city")
public class PubinfoCityController {

    @Autowired
    PubinfoCityService pubinfoCityService;

    @GetMapping("/all")
    public Result getAll(){
        List<PubinfoCity> pubinfoCityList = pubinfoCityService.list();
        return Result.succ(pubinfoCityList);
    }

}

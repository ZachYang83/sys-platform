package com.gpzi.gpplatform.tra_monitor.controller;


import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.tra_monitor.entity.OdTrucks;
import com.gpzi.gpplatform.tra_monitor.service.OdTrucksService;
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
@RequestMapping("/tra_monitor/od-trucks")
public class OdTrucksController {

    @Autowired
    OdTrucksService odTrucksService;

    @GetMapping("/all")
    public Result getAll(){
        List<OdTrucks> odTrucksList = odTrucksService.list();
        return Result.succ(odTrucksList);
    }

}

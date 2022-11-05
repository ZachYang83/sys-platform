package com.gpzi.gpplatform.tra_monitor.controller;


import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.tra_monitor.entity.TrucksOD;
import com.gpzi.gpplatform.tra_monitor.service.TrucksODService;
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
 * @since 2021-04-18
 */
@RestController
@RequestMapping("/tra_monitor/trucks-od")
public class TrucksODController {

    @Autowired
    TrucksODService trucksODService;

    @GetMapping("/all")
    public Result getAll(){
        List<TrucksOD> trucksODList = trucksODService.list();
        return Result.succ(trucksODList);
    }

}

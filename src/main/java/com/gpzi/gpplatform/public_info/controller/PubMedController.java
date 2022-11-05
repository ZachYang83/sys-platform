package com.gpzi.gpplatform.public_info.controller;


import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.public_info.entity.PubMed;
import com.gpzi.gpplatform.public_info.service.PubMedService;
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
 * @since 2021-04-15
 */
@RestController
@RequestMapping("/public_info/pub-med")
public class PubMedController {

    @Autowired
    PubMedService pubMedService;

    @GetMapping("/all")
    public Result getAll(){
        List<PubMed> pubMedList = pubMedService.list();
        return Result.succ(pubMedList);
    }

}

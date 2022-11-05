package com.gpzi.gpplatform.public_info.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.public_info.entity.PubEdu;
import com.gpzi.gpplatform.public_info.service.PubEduService;
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
@RequestMapping("/public_info/pub-edu")
public class PubEduController {

    @Autowired
    PubEduService pubEduService;

    @GetMapping("/all")
    public Result getAll(){
        List<PubEdu> pubEduList = pubEduService.list();
        return Result.succ(pubEduList);
    }

}

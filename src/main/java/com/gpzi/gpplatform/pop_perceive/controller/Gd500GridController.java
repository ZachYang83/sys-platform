package com.gpzi.gpplatform.pop_perceive.controller;


import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.pop_perceive.entity.Gd500Grid;
import com.gpzi.gpplatform.pop_perceive.service.Gd500GridService;
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
 * @since 2021-04-10
 */
@RestController
@RequestMapping("/gd-500-grid")
public class Gd500GridController {

    @Autowired
    Gd500GridService gd500GridService;

    @GetMapping("/all")
    public Result getAll(){
        List<Gd500Grid> gd500Grid_list = gd500GridService.list();
        return Result.succ(gd500Grid_list);
    }

}

package com.gpzi.gpplatform.pop_perceive.controller;


import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.pop_perceive.entity.BayPop;
import com.gpzi.gpplatform.pop_perceive.service.BayPopService;
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
 * @since 2021-04-12
 */
@RestController
@RequestMapping("/pop_perceive/bay-pop")
public class BayPopController {

    @Autowired
    BayPopService bayPopService;

    @GetMapping("/all")
    public Result getAll(){
        List<BayPop> bayPop_list = bayPopService.list();
        return  Result.succ(bayPop_list);
    }

}

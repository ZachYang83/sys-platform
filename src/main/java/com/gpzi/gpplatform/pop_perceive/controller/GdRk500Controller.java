package com.gpzi.gpplatform.pop_perceive.controller;


import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.pop_perceive.entity.GdRk500;
import com.gpzi.gpplatform.pop_perceive.service.GdRk500Service;
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
 * @since 2021-05-07
 */
@RestController
@RequestMapping("/pop_perceive/gd-rk500")
public class GdRk500Controller {

    @Autowired
    GdRk500Service gdRk500Service;

    @GetMapping("/all")
    public Result getAll(){
        List<GdRk500> gdRk500List = gdRk500Service.list();
        return Result.succ(gdRk500List);
    }

}

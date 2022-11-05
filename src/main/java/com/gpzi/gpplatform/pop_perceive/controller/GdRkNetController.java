package com.gpzi.gpplatform.pop_perceive.controller;


import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.pop_perceive.entity.GdRkNet;
import com.gpzi.gpplatform.pop_perceive.service.GdRkNetService;
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
 * @since 2021-04-28
 */
@RestController
@RequestMapping("/pop_perceive/gd-rk-net")
public class GdRkNetController {

    @Autowired
    GdRkNetService gdRkNetService;

    @GetMapping("/all")
    public Result getAll(){
        List<GdRkNet> gdRkNetList = gdRkNetService.list();
        return Result.succ(gdRkNetList);
//        List<Object> listObjs = gdRkNetService.listObjs();
//        return Result.succ(listObjs);
    }

}

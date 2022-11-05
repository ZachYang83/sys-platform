package com.gpzi.gpplatform.pop_perceive.controller;


import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.pop_perceive.entity.TotalOccuPop;
import com.gpzi.gpplatform.pop_perceive.service.TotalOccuPopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gpzi
 * @since 2021-04-08
 */
@RestController
@RequestMapping("/total-occu-pop")
public class TotalOccuPopController {

    @Autowired
    TotalOccuPopService totalOccuPopService;

    @GetMapping("/{id}")
    public Result getOne(@PathVariable("id") Long id){
        TotalOccuPop totalOccuPop = totalOccuPopService.getById(id);
        return Result.succ(totalOccuPop);
    }

    @GetMapping("/all")
    public Result getAll(){
        List<TotalOccuPop> TOP_list = totalOccuPopService.list();
        return Result.succ(TOP_list);
    }
}

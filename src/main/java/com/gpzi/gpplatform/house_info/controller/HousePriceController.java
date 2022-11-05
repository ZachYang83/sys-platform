package com.gpzi.gpplatform.house_info.controller;


import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.house_info.entity.HousePrice;
import com.gpzi.gpplatform.house_info.service.HousePriceService;
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
 * @since 2021-05-21
 */
@RestController
@RequestMapping("/house_info/house-price")
public class HousePriceController {

    @Autowired
    HousePriceService housePriceService;

    @GetMapping("/all")
    public Result getAll(){
        List<HousePrice> housePriceList = housePriceService.list();
        return Result.succ(housePriceList);
    }
}

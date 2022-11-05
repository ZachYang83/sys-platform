package com.gpzi.gpplatform.pop_perceive.controller;


import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.pop_perceive.entity.CityData;
import com.gpzi.gpplatform.pop_perceive.service.CityDataService;
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
 * @since 2021-04-13
 */
@RestController
@RequestMapping("/pop_perceive/city-data")
public class CityDataController {

    @Autowired
    CityDataService cityDataService;

    @GetMapping("/all")
    public Result getAll(){
        List<CityData> city_data_list = cityDataService.list();
        return Result.succ(city_data_list);
    }

}

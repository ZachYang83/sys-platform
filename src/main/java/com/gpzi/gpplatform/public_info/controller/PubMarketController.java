package com.gpzi.gpplatform.public_info.controller;


import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.public_info.entity.PubMarket;
import com.gpzi.gpplatform.public_info.service.PubMarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gpzi
 * @since 2021-05-19
 */
@RestController
@RequestMapping("/public_info/pub-market")
public class PubMarketController {

    @Autowired
    PubMarketService pubMarketService;

    @RequestMapping("/all")
    public Result getAll(){
        List<PubMarket> pubMarketList = pubMarketService.list();
        return Result.succ(pubMarketList);
    }

}

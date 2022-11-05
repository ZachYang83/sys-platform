package com.gpzi.gpplatform.public_info.controller;


import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.public_info.entity.PubCiv;
import com.gpzi.gpplatform.public_info.service.PubCivService;
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
@RequestMapping("/public_info/pub-civ")
public class PubCivController {

    @Autowired
    PubCivService pubCivService;

    @GetMapping("/all")
    public Result getAll(){
        List<PubCiv> pubCivList = pubCivService.list();
        return Result.succ(pubCivList);
    }

}

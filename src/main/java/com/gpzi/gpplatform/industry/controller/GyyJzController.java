package com.gpzi.gpplatform.industry.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.industry.entity.GyyJz;
import com.gpzi.gpplatform.industry.service.GyyJzService;
import com.gpzi.gpplatform.pop_perceive.entity.GdDisod;
import com.gpzi.gpplatform.pop_perceive.entity.TotalOccuPop;
import com.gpzi.gpplatform.pop_perceive.service.PzLiveGridService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gpzi
 * @since 2022-11-01
 */
@RestController
@RequestMapping("/industry/gyy-jz")
public class GyyJzController {
    @Autowired
    GyyJzService gyyJzService;

    @GetMapping("/getGyyId")
    public Result getGyyJzByIds(@RequestParam("id") Integer id){
        GyyJz gyyJz = gyyJzService.getById(id);
        return Result.succ(gyyJz);
    }
}

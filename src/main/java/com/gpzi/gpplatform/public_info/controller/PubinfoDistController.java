package com.gpzi.gpplatform.public_info.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.public_info.entity.PubEdu;
import com.gpzi.gpplatform.public_info.entity.PubinfoDist;
import com.gpzi.gpplatform.public_info.service.PubinfoDistService;
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
 * @since 2021-04-14
 */
@RestController
@RequestMapping("/public_info/pubinfo-dist")
public class PubinfoDistController {

    @Autowired
    PubinfoDistService pubinfoDistService;

    @GetMapping("/edu_info")
    public Result getEduAll(){
        QueryWrapper<PubinfoDist> wrapper = new QueryWrapper<>();
        wrapper.orderByAsc("sum_edu");
        List<PubinfoDist> edu_info = pubinfoDistService.list(wrapper);
        return Result.succ(edu_info);
    }

    @GetMapping("/med_info")
    public Result getMedAll(){
        QueryWrapper<PubinfoDist> wrapper = new QueryWrapper<>();
        wrapper.orderByAsc("sum_med");
        List<PubinfoDist> med_info = pubinfoDistService.list(wrapper);
        return Result.succ(med_info);
    }

    @GetMapping("/civ_info")
    public Result getCivAll(){
        QueryWrapper<PubinfoDist> wrapper = new QueryWrapper<>();
        wrapper.orderByAsc("sum_civ");
        List<PubinfoDist> civ_info = pubinfoDistService.list(wrapper);
        return Result.succ(civ_info);
    }

    @GetMapping("/pal_info")
    public Result getPalAll(){
        QueryWrapper<PubinfoDist> wrapper = new QueryWrapper<>();
        wrapper.orderByAsc("sum_pal");
        List<PubinfoDist> pal_info = pubinfoDistService.list(wrapper);
        return Result.succ(pal_info);
    }

    @GetMapping("/cul_info")
    public Result getCulAll(){
        QueryWrapper<PubinfoDist> wrapper = new QueryWrapper<>();
        wrapper.orderByAsc("sum_cul");
        List<PubinfoDist> cul_info = pubinfoDistService.list(wrapper);
        return Result.succ(cul_info);
    }

    @GetMapping("/spo_info")
    public Result getSpoAll(){
        QueryWrapper<PubinfoDist> wrapper = new QueryWrapper<>();
        wrapper.orderByAsc("sum_spo");
        List<PubinfoDist> spo_info = pubinfoDistService.list(wrapper);
        return Result.succ(spo_info);
    }
}

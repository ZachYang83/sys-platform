package com.gpzi.gpplatform.tra_monitor.controller;


import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.tra_monitor.entity.Od1000;
import com.gpzi.gpplatform.tra_monitor.entity.PopOd1000;
import com.gpzi.gpplatform.tra_monitor.service.Od1000Service;
import com.gpzi.gpplatform.tra_monitor.service.PopOd1000Service;
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
@RequestMapping("/tra_monitor/od1000")
public class Od1000Controller {

    @Autowired
    Od1000Service od1000Service;

    @GetMapping("/all")
    public Result getAll(){
        List<Od1000> Od1000_list = od1000Service.list();
        return Result.succ(Od1000_list);
    }

}

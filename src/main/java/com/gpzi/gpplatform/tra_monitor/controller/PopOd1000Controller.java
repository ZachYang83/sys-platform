package com.gpzi.gpplatform.tra_monitor.controller;


import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.tra_monitor.entity.PopOd1000;
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
@RequestMapping("/tra_monitor/pop-od1000")
public class PopOd1000Controller {

    @Autowired
    PopOd1000Service popOd1000Service;

    @GetMapping("/all")
    public Result getAll(){
        List<PopOd1000> popOd1000_list = popOd1000Service.list();
        return Result.succ(popOd1000_list);
    }

}

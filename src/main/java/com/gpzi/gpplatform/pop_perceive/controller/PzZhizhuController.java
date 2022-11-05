package com.gpzi.gpplatform.pop_perceive.controller;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.pop_perceive.ato.Ids;
import com.gpzi.gpplatform.pop_perceive.entity.GdHj500;
import com.gpzi.gpplatform.pop_perceive.entity.PzZhizhu;
import com.gpzi.gpplatform.pop_perceive.service.GdHj500Service;
import com.gpzi.gpplatform.pop_perceive.service.PzZhizhuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gpzi
 * @since 2022-10-26
 */
@RestController
@RequestMapping("/pop_perceive/pz-zhizhu")
public class PzZhizhuController {

    @Autowired
    PzZhizhuService pzZhizhuService;

    @PostMapping("/getWorkLive")
    public Result getWorkLiveByIds(@RequestBody String ids){
        QueryWrapper<PzZhizhu> wrapper = new QueryWrapper<>();
        Ids idsObj = JSONObject.parseObject(ids, Ids.class);
        String ids_string =  idsObj.getIds();
        String ids_string2 = ids_string.substring(1,ids_string.length()-1);
        String[] arr = ids_string2.split(",");
        Object[] ids_list = Arrays.stream(arr).toArray();
        wrapper.in("net_id",ids_list);
        wrapper.select("sum(work2019) as work2019,sum(work2022) as work2022,sum(live2019) as live2019,sum(live2022) as live2022");
        List<PzZhizhu> pzZhizhuList = pzZhizhuService.list(wrapper);
        return Result.succ(pzZhizhuList);
    }
}

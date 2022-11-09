package com.gpzi.gpplatform.pop_perceive.controller;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gpzi.gpplatform.common.lang.Result;
import com.gpzi.gpplatform.pop_perceive.ato.Ids;
import com.gpzi.gpplatform.pop_perceive.entity.GdZy500;
import com.gpzi.gpplatform.pop_perceive.service.GdZy500Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gpzi
 * @since 2021-04-21
 */
@RestController
@RequestMapping("/pop_perceive/gd-zy500")
public class GdZy500Controller {

    @Autowired
    GdZy500Service gdZy500Service;

    @PostMapping("/getPop")
    public Result getPop(@RequestBody String ids){

        QueryWrapper<GdZy500> wrapper = new QueryWrapper<>();
        Ids idsObj = JSONObject.parseObject(ids, Ids.class);
        String ids_string =  idsObj.getIds();
        String ids_string2 = ids_string.substring(1,ids_string.length()-1);
        String[] arr = ids_string2.split(",");
        Object[] ids_list = Arrays.stream(arr).toArray();
        wrapper.in("UID_500m",ids_list);
        wrapper.groupBy("time");
        wrapper.orderByAsc("time");
        wrapper.select("time,sum(sums) /24 as sums");
        List<GdZy500> gdZy500List = gdZy500Service.list(wrapper);
        return Result.succ(gdZy500List);
    }

    @PostMapping("/getOccu")
    public Result getOccu(@RequestBody String ids){

        QueryWrapper<GdZy500> wrapper = new QueryWrapper<>();
        Ids idsObj = JSONObject.parseObject(ids, Ids.class);
        String ids_string =  idsObj.getIds();
        String ids_string2 = ids_string.substring(1,ids_string.length()-1);
        String[] arr = ids_string2.split(",");
        Object[] ids_list = Arrays.stream(arr).toArray();
        wrapper.in("UID_500m",ids_list);
        wrapper.select("sb,sum(businessman) /24 as businessman,sum(taxiDriver) /24 as taxiDriver,sum(student) /24 as student,sum(salariatFixed) /24 as salariatFixed,sum(indiBussiness) /24 as indiBussiness,sum(salariatUnfixed) /24 as salariatUnfixed,sum(finance) /24 as finance,sum(manuIndustry) /24 as manuIndustry,sum(adMedia) /24 as adMedia,sum(eduTra) /24 as eduTra,sum(correspondence) /24 as correspondence,sum(architecture) /24 as architecture,sum(service) /24 as service,sum(realEstate) /24 as realEstate,sum(logistics) /24 as logistics,sum(medTreatment) /24 as medTreatment,sum(IT) /24 as IT");
//        wrapper.groupBy("sb");
        List<GdZy500> gdZy500List = gdZy500Service.list(wrapper);
        return Result.succ(gdZy500List);
    }

}

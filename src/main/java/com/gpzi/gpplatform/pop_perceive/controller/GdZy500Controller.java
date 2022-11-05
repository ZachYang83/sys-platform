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
        wrapper.select("time,sum(sums) as sums");
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
        wrapper.select("sb,sum(businessman) as businessman,sum(taxiDriver) as taxiDriver,sum(student) as student,sum(salariatFixed) as salariatFixed,sum(indiBussiness) as indiBussiness,sum(salariatUnfixed) as salariatUnfixed,sum(finance) as finance,sum(manuIndustry) as manuIndustry,sum(adMedia) as adMedia,sum(eduTra) as eduTra,sum(correspondence) as correspondence,sum(architecture) as architecture,sum(service) as service,sum(realEstate) as realEstate,sum(logistics) as logistics,sum(medTreatment) as medTreatment,sum(IT) as IT");
        wrapper.groupBy("sb");
        List<GdZy500> gdZy500List = gdZy500Service.list(wrapper);
        return Result.succ(gdZy500List);
    }

}

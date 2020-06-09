package com.example.demo3.controller;


import com.example.demo3.entity.ParkConfig;
import com.example.demo3.service.ParkConfigService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhang
 * @since 2020-06-09
 */
@Controller
@RequestMapping("/parkConfig")
@Api("测试4")
public class ParkConfigController {

    @Autowired
    private ParkConfigService parkConfigService;
    @RequestMapping(value = "/test4",method = RequestMethod.GET)
    @ResponseBody
    public List<ParkConfig> Test5() {
        List<ParkConfig> list =  parkConfigService.list();
        return list;
    }

    @GetMapping("/page/{pagenow}/{pagecount}")
    @ResponseBody
    public List<ParkConfig> finePage(@PathVariable String pagenow,@PathVariable String pagecount){

        List<ParkConfig> parkConfigs =parkConfigService.finePage(pagenow,pagecount);

        return parkConfigs ;
   }
}


package com.example.eurekaClient.controller;


import com.example.eurekaClient.entity.Good;
import com.example.eurekaClient.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/myTest")
public class goodController {
    @Autowired
    private GoodService goodService;

    @RequestMapping(value = "/getGoodByID",method = RequestMethod.GET)
public String getGood(int goodID){
return goodService.getGoodInfo(goodID).toString();
}

@RequestMapping("/selectAll")
    @ResponseBody
public List<Good> ListGood(){
    return goodService.selectAll();
}
}


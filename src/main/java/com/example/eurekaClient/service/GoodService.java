package com.example.eurekaClient.service;

import com.example.eurekaClient.entity.Good;
import com.example.eurekaClient.mapper.GoodMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodService {
    @Autowired
    private GoodMapper goodMapper;
    public Good getGoodInfo(int goodID){
        return goodMapper.getGoodInfo(goodID);
    }
    public List<Good> selectAll(){
        return goodMapper.selectAll();
    }
}

package com.example.eurekaClient.mapper;

import com.example.eurekaClient.entity.Good;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface GoodMapper {
    Good getGoodInfo(int goodID);
    List<Good> selectAll();
}

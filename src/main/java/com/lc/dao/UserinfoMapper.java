package com.lc.dao;

import com.lc.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

//@Mapper
public interface UserinfoMapper {
    int deleteByPrimaryKey(Integer id);

    List<Map> findByUserName(@Param("username") String username);

//    User findByEmail(@Param("ip") String ip);

}
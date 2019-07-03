package com.lc.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author baibing
 * @project: springboot-mybatis
 * @package: com.sailing.springbootmybatis.service
 * @Description: service 业务接口
 * @date 2018/9/12 09:52
 */
public interface UserinfoService {


    List<Map> findByUserName(@Param("username") String username);

}

package com.lc.service.Impl;

import com.lc.dao.UserinfoMapper;
import com.lc.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author baibing
 * @project: springboot-mybatis
 * @package: com.sailing.springbootmybatis.service.impl
 * @Description: service实现类
 * @date 2018/9/12 10:03
 */
@Service
@Transactional
public class UserinfoServiceImpl implements UserinfoService {

    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private UserinfoMapper userinfoMapper;


    @Override
    public List<Map> findByUserName(String username) {
        return null;
    }


}

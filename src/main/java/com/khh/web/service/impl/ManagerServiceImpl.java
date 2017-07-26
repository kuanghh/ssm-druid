package com.khh.web.service.impl;

import com.khh.web.dao.ManagerMapper;
import com.khh.web.domain.Manager;
import com.khh.web.service._interface.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 951087952@qq.com on 2017/7/26.
 */
@Service("managerService")
public class ManagerServiceImpl implements ManagerService{

    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public int insert(Manager manager) {
        return managerMapper.insert(manager);
    }

    @Override
    public Manager findById(int id) {
        return managerMapper.selectByPrimaryKey(id);
    }
}

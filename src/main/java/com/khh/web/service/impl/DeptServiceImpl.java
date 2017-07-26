package com.khh.web.service.impl;

import com.khh.web.dao.DeptMapper;
import com.khh.web.domain.Dept;
import com.khh.web.service._interface.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 951087952@qq.com on 2017/7/26.
 */
@Service("deptService")
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptMapper deptMapper;
    @Override
    public int insert(Dept dept) {
        return deptMapper.insert(dept);
    }
}

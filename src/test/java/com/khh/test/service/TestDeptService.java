package com.khh.test.service;

import com.khh.web.domain.Dept;
import com.khh.web.service._interface.DeptService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by 951087952@qq.com on 2017/7/26.
 */
public class TestDeptService {

    @Test
    public void test1() throws Exception{

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
        DeptService deptService = (DeptService) context.getBean("deptService");
        Dept dept = new Dept();

        dept.setCreateTime(new Date());
        dept.setName("部门1");
        deptService.insert(dept);

    }
}

package com.khh.test.service;

import com.khh.web.domain.Manager;
import com.khh.web.service._interface.DeptService;
import com.khh.web.service._interface.ManagerService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 951087952@qq.com on 2017/7/26.
 */
public class TestManagerService {

    @Test
    public void testWrite() throws Exception{

        Manager manager = new Manager();
        manager.setName("经理1");
        List<String> interetsList = Arrays.asList("跳舞","唱歌","玩游戏");
        manager.setInterest(interetsList);
        manager.setDeptId(1);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
        ManagerService managerService = (ManagerService) context.getBean("managerService");

        managerService.insert(manager);
    }

    @Test
    public void testRead() throws Exception{

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
        ManagerService managerService = (ManagerService) context.getBean("managerService");

        Manager manager = managerService.findById(1);
        System.out.println(manager.toString());
    }
}

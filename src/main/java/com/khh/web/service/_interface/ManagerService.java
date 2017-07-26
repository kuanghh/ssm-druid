package com.khh.web.service._interface;

import com.khh.web.domain.Manager;

/**
 * Created by 951087952@qq.com on 2017/7/26.
 */
public interface ManagerService {

    int insert(Manager manager);

    Manager findById(int id);
}

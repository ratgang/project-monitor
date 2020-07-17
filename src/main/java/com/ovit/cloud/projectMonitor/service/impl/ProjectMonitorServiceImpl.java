package com.ovit.cloud.projectMonitor.service.impl;

import com.ovit.cloud.projectMonitor.mapper.ProjectMonitorMapper;
import com.ovit.cloud.projectMonitor.service.ProjectMonitorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Created by wenzhiyu on 2020/7/17 13:38
 */
public class ProjectMonitorServiceImpl implements ProjectMonitorService {

    @Autowired
    ProjectMonitorMapper projectMonitorMapper;

    @Override
    public void testJdbc() {
        Map<String,Object> result = projectMonitorMapper.testJdbc();
        System.out.println(result.size());
    }
}

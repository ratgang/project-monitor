package com.ovit.cloud.projectMonitor.controller;

import com.ovit.cloud.projectMonitor.entity.Result;
import com.ovit.cloud.projectMonitor.service.ProjectMonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wenzhiyu on 2020/7/17 9:10
 */
@RestController
@RequestMapping(value = "/api")
public class ProjectMonitorController {

    @Autowired
    ProjectMonitorService projectMonitorService;
    @RequestMapping(value = "/testMultiFile")
    public Result testMultiFile(HttpServletRequest request,
                                   @RequestParam("uploadFile") MultipartFile[] uploadFile,
                                   @RequestParam("name") String name){
        Result result = new Result();
        try {
            System.out.println(uploadFile.length);
            for (MultipartFile file : uploadFile){
                System.out.println(file.getOriginalFilename());
            }
            System.out.println(name);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping(value = "/testJdbc")
    public Result testJdbc(HttpServletRequest request){
        Result result = new Result();
        try {
            projectMonitorService.testJdbc();
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping(value = "/saveProjectTotal")
    public Result saveProjectTotal(HttpServletRequest request,
                                   @RequestParam("uploadFile") MultipartFile[] uploadFile,
                                   @RequestParam("projectName") String projectName,
                                   @RequestParam("projectNumber") String projectNumber,
                                   @RequestParam("replyDocument") String replyDocument,
                                   @RequestParam("replyNumber") String replyNumber,
                                   @RequestParam("replyDate") String replyDate,
                                   @RequestParam("projectBatch") String projectBatch,
                                   @RequestParam("projectBelong") String projectBelong,
                                   @RequestParam("beginYear") String beginYear,
                                   @RequestParam("buildPeriod") String buildPeriod,
                                   @RequestParam("planTotalAmount") String area,
                                   @RequestParam("centralFinancialAmount") String centralFinancialAmount,
                                   @RequestParam("localSelfAmount") String localSelfAmount,
                                   @RequestParam("localFinancialAmount") String localFinancialAmount,
                                   @RequestParam("localSocialAmount") String localSocialAmount,
                                   @RequestParam("localObligorsAmount") String localObligorsAmount,
                                   @RequestParam("localOtherAmount") String localOtherAmount,
                                   @RequestParam("planSubProjectNumber") String planSubProjectNumber,
                                   @RequestParam("beginSubProjectNumber") String beginSubProjectNumber,
                                   @RequestParam("checkSubProjectNumber") String checkSubProjectNumber,
                                   @RequestParam("targetYear") String targetYear,
                                   @RequestParam("totalGoals") String totalGoals,
                                   @RequestParam("KpiTarget") String kpiTarget){
        Result result = new Result();
        try {
            System.out.println(uploadFile.length);
            for (MultipartFile file : uploadFile){
                System.out.println(file.getOriginalFilename());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}

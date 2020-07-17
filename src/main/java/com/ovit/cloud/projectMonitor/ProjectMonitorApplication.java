package com.ovit.cloud.projectMonitor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.ovit.cloud.projectMonitor"})
public class ProjectMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectMonitorApplication.class, args);
	}

}

package com.sam.main;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cn.hutool.extra.spring.SpringUtil;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@MapperScan("com.sam.**.mapper")
@Slf4j
public class SamApplication {
    public static void main(String[] args) {
        SpringApplication.run(SamApplication.class,args);
        log.info("Swagger doc Url: http://localhost:{}{}/doc.html", SpringUtil.getProperty("server.port"),SpringUtil.getProperty("server.servlet.context-path"));
        log.info("Druid Url:http://localhost:{}{}/druid/index.html", SpringUtil.getProperty("server.port"), SpringUtil.getProperty("server.servlet.context-path"));        
    }


}

package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import zipkin.server.EnableZipkinServer;

/**
 * @Author: yunxiang.yang
 * @Date: 2018/12/20 18:08
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@EnableZipkinServer
public class MicroserviceZipkinServer {
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceZipkinServer.class);
    }
}

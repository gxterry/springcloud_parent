package com.gx.sc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by GuoXin on 2018/5/10.
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigApplication {


    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigApplication.class).web(true).run(args);
    }
}

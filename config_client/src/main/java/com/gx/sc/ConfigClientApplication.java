package com.gx.sc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by GuoXin on 2018/5/10.
 */
@SpringBootApplication
public class ConfigClientApplication {


    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigClientApplication.class).web(true).run(args);
    }
}

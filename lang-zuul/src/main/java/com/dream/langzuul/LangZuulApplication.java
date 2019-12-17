package com.dream.langzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class LangZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(LangZuulApplication.class, args);
    }

}

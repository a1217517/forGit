package com.forgit.wzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WzyApplication {

    //dev
    public static void main(String[] args) {
        System.out.println("master");
        System.out.println("dev");
        SpringApplication.run(WzyApplication.class, args);
    }

}

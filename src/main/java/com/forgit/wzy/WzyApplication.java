package com.forgit.wzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WzyApplication {

    public static void main(String[] args)
    {
        System.out.println("master");
        SpringApplication.run(WzyApplication.class, args);
    }

}

package com.example.SpringBoot;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class cronClass {

    @Scheduled(cron = "*/3 * * * * * ")
    public void printHello(){
        System.out.println("Hello from printHello");
    }

}

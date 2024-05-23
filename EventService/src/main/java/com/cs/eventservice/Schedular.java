package com.cs.eventservice;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class Schedular {
    @Scheduled(fixedDelay = 1000)
    void runner(){
        System.out.println("EventService is running...");
    }
}

package com.gameofthrones.startersiemens;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */

public class HelloWorldService {

    @Scheduled(fixedDelay = 1000)
    public void sayHi(){
        System.out.println("Welcome to Iron bank");
    }
}

package com.gameofthrones.startersiemens;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Evgeny Borisov
 */
@Aspect
public class ExceptionHandlerAspect {

    @Autowired
    private RavenProperties ravenProperties;




    @AfterThrowing(pointcut = "execution(* com.gameofthrones.ironbank.services..*.*(..))",throwing = "ex")
    public void handleMoneyException(NotEnoughMoneyException ex) {
        System.out.println("raven is flying to: "+ravenProperties.getDestination());
        System.out.println("raven was sent with message: "+ex);
    }
}




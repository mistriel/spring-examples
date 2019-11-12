package com.gameofthrones.startersiemens;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 */
@Configuration
@EnableScheduling
@EnableConfigurationProperties(RavenProperties.class)
public class StarterConf {


    @Bean
    @ConditionalOnProd
    @ConditionalOnProperty("raven.destination")
    public ExceptionHandlerAspect exceptionHandlerAspect(){
        return new ExceptionHandlerAspect();
    }

    @Bean
    public HelloWorldService helloWorldService(){
        return new HelloWorldService();

    }
}

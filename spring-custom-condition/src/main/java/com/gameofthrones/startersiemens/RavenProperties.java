package com.gameofthrones.startersiemens;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Data
@ConfigurationProperties("raven")
public class RavenProperties {

    private String destination;
}

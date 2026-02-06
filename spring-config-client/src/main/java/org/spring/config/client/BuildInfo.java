package org.spring.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BuildInfo {

    @Value("${build.id}")
    private int id;

    @Value("${build.version}")
    private String version;

    @Value("${build.name}")
    private String name;

    @Value("${build.type}")
    private String type;

    public int getId() {
        return id;
    }

    public String getVersion() {
        return version;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}

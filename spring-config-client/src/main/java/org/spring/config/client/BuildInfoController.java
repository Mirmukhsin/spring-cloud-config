package org.spring.config.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuildInfoController {
    private final BuildInfo buildInfo;

    public BuildInfoController(BuildInfo buildInfo) {
        this.buildInfo = buildInfo;
    }

    @GetMapping("/get-info")
    public String getInfo() {
        return "[ Id: " + buildInfo.getId() + "] [ Version: " + buildInfo.getVersion() + "] [ Name: " + buildInfo.getName() + "] [ Type: " + buildInfo.getType();
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hellooo";
    }
}

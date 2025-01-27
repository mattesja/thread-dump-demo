package com.demo.performance;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/slow")
public class SlowController {

    @GetMapping
    public String getDummy() {
        new BadImplementation().soSlow();
        return "This is a slow endpoint";
    }
}

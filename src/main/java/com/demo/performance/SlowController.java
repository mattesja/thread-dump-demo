package com.demo.performance;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/slow")
public class SlowController {

    @GetMapping
    public String getDummy() throws InterruptedException {
        Thread.sleep(5000);
        return "This is a slow endpoint";
    }
}

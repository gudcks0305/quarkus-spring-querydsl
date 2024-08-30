package com.hc.quarkus.controller;

import com.hc.quarkus.GreetingConfig;
import com.hc.quarkus.controller.repository.GreetingRepositoryAdapter;
import io.smallrye.common.annotation.RunOnVirtualThread;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//import lombok.RequaredArgsConstructor;
@RestController
@RequiredArgsConstructor
@RunOnVirtualThread
public class HelloController {
    private final GreetingRepositoryAdapter greetingRepositoryAdapter;
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Quarkus REST";
    }
    @GetMapping("/test")
    public List<?> test() {
        return greetingRepositoryAdapter.findAll();
    }
}

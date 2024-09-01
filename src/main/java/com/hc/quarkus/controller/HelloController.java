package com.hc.quarkus.controller;

import com.hc.quarkus.MyEntity;
import com.hc.quarkus.MyRemoteService;
import com.hc.quarkus.repository.GreetingRepositoryAdapter;
import io.smallrye.common.annotation.RunOnVirtualThread;
import java.util.List;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
//import lombok.RequaredArgsConstructor;
@RestController
@RunOnVirtualThread
public class HelloController {
    private final GreetingRepositoryAdapter greetingRepositoryAdapter;

    private final MyRemoteService myRemoteService;

    public HelloController(GreetingRepositoryAdapter greetingRepositoryAdapter, @RestClient MyRemoteService myRemoteService) {
        this.greetingRepositoryAdapter = greetingRepositoryAdapter;
        this.myRemoteService = myRemoteService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Quarkus REST";
    }
    @GetMapping("/test")
    public List<?> test() {
        return greetingRepositoryAdapter.findAll();
    }
    @PostMapping("/save")
    public String save() {
        greetingRepositoryAdapter.save(new MyEntity("test" + System.currentTimeMillis()));
        return "Saved";
    }
    @GetMapping("/remote")
    public List<MyRemoteService.Extension> remote() {
        return List.copyOf(myRemoteService.getExtensionsById("io.quarkus:quarkus-hibernate-validator"));
    }
}

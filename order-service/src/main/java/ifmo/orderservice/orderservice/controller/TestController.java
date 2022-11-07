package ifmo.orderservice.orderservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${name:unknown}")
    private String name;

    @GetMapping("/test")
    public String getName() {
        return name;
    }
}

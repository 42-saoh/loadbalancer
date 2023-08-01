package com.example.postserver;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final TestClient testClient;

    public TestController(TestClient testClient) {
        this.testClient = testClient;
    }

    @RequestMapping("/app1")
    public String order(@RequestParam(value = "num", defaultValue = "500") int num) {
        return testClient.order(num);
    }

    @RequestMapping("/bpp1")
    public String pay(@RequestParam(value = "num", defaultValue = "1500") int num) {
        return testClient.pay(num);
    }
}

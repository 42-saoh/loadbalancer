package com.example.postserver;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "zuul", fallbackFactory = FeignFactory.class)
public interface TestClient {
    @GetMapping("/app1/{num}")
    String order(@PathVariable("num") int num);

    @GetMapping("/bpp1/{num}")
    String pay(@PathVariable("num") int num);
}
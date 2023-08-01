package com.example.postserver;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class FeignFactory implements FallbackFactory<TestClient> {
    @Override
    public TestClient create(Throwable cause) {
        return new TestClient() {
            @Override
            public String order(int num) {
                System.out.println(cause.getMessage());
                return "주문 실패";
            }

            @Override
            public String pay(int num) {
                System.out.println(cause.getMessage());
                return "결제 실패";
            }
        };
    }
}

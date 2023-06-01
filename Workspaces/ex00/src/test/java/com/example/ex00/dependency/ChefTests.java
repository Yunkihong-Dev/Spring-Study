package com.example.ex00.dependency;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ChefTests {
    @Autowired
    Restaurant restaurant;

    @Test
    public void chefTests() {
        log.info(restaurant.getChef().toString());
    }

}
// Qualifier
// @Autowired를 통해 같은 타입의 객체가 여러개가 있다면, 구분이 불가능하다.이 때 Qualifier를 통해 식별자를 부여하면 원하는 객체를 주입받을 수 있다.
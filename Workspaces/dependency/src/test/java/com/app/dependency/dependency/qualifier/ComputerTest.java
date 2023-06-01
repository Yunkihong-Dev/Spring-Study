package com.app.dependency.dependency.qualifier;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ComputerTest {
    @Autowired
    @Qualifier(value = "Laptop")
    private Computer computer;

    @Test
    public void laptopTest() {
//        log.info(computer.getScreenSize());
    }

}

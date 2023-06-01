package com.example.ex01.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class mapperTests {
    @Autowired
    private TimeMapper timeMapper;
    @Autowired
    private ProductMapper productMapper;

    @Test
    public void getTime() {
        log.info(timeMapper.getTime());
    }
}

package com.app.dependency.dependency.qualifier;

import com.app.dependency.dependency.qualifier.task.Resturant;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ResturantTest {

    @Autowired
    @Qualifier(value = "vips")
    private Resturant resturant;

    @Test
    public void outbackTest() {
        log.info(resturant.toString());
    }
}

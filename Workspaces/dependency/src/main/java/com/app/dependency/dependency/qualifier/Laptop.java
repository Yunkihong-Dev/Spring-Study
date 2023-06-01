package com.app.dependency.dependency.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "Laptop")
public class Laptop implements Computer {
    @Override
    public int getScreenSize() {
        return 1080;
    }
}

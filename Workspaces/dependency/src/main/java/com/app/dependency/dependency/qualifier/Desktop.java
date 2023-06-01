package com.app.dependency.dependency.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "Desktop")
@Primary
public class Desktop implements Computer {
    @Override
    public int getScreenSize() {
        return 1280;
    }
}

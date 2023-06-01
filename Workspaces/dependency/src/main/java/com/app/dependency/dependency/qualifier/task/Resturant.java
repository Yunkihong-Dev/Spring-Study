package com.app.dependency.dependency.qualifier.task;

import org.springframework.stereotype.Component;

@Component
public interface Resturant {
    public int steakPrice = 10000;

    public boolean selfbar();
}

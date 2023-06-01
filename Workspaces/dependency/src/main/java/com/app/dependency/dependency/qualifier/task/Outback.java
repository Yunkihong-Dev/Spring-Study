package com.app.dependency.dependency.qualifier.task;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "outback")
@Primary
@Data
public class Outback implements Resturant {
    private int steak = Resturant.steakPrice + 1000;

    public final boolean selfbar() {
        return true;
    }
}

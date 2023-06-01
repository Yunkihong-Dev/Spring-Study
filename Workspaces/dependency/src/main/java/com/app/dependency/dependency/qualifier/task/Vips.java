package com.app.dependency.dependency.qualifier.task;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "vips")
@Data
public class Vips implements Resturant {
    private int steak = Resturant.steakPrice - 2000;

    public final boolean selfbar() {
        return false;
    }
}

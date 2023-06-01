package com.example.ex00.dependency;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Computer {

    //  필드주입
    private int ram;

}

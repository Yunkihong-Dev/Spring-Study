package com.app.dependency.dependency;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
public class Class {
    private final Teacher teacher;
    private List<Student> students = new ArrayList<>();
}

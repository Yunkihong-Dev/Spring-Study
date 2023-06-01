package com.app.dependency.dependency;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class School {
    List<Teacher> teachers = new ArrayList<>();
    List<Student> students = new ArrayList<>();
    List<Class> classes = new ArrayList<>();
}

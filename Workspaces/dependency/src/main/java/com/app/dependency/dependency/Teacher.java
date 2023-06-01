package com.app.dependency.dependency;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Getter
@RequiredArgsConstructor
public class Teacher {
    private final School school;
    private List<Class> classes = new ArrayList<>();
}

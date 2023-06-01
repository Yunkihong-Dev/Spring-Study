package com.app.dependency.dependency;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@SpringBootTest
@Slf4j
public class SchoolTest {
    @Autowired
    private School school;
    private Teacher teacher;
    private Class cls;


    @Test
    public void schoolTest() {
//    List<Student> students = new ArrayList<Student>(Arrays.asList(new Student(school)));
    }
}

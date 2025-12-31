package com.backend.springboot.learn_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/Courses")
    public List<Course> getCourseDetail(){
        return Arrays.asList(
                new Course(1, "java", "akash"),
                new Course(2, "C++", "aman"),
                new Course(3, "AWS", "ajit")

        );

    }
}

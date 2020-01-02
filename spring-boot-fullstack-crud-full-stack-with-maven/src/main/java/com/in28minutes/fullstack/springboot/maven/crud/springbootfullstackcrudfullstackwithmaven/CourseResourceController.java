package com.in28minutes.fullstack.springboot.maven.crud.springbootfullstackcrudfullstackwithmaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseResourceController {
    @Autowired
    private  CoursesHardcodedService coursesHardcodedService;
    @GetMapping("/instructors/{username}/courses")
    public List<Course> getAllCourses(@PathVariable String username) {
        return coursesHardcodedService.findAll();
    }

}

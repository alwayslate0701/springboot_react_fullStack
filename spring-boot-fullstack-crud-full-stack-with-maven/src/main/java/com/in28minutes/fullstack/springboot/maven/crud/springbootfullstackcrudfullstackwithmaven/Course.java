package com.in28minutes.fullstack.springboot.maven.crud.springbootfullstackcrudfullstackwithmaven;

import lombok.Data;

@Data
public class Course {
    private Long id;
    private String username;
    private String description;

    public Course (Long id, String username, String description) {
        this.id = id;
        this.username = username;
        this.description = description;
    }
}

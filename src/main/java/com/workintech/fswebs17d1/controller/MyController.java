package com.workintech.fswebs17d1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Value("${course.name}")
    private String courseName;

    @Value("${project.developer.fullname}")
    private String developerFullName;
}

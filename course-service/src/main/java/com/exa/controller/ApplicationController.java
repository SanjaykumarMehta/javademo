package com.exa.controller;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exa.model.Course;

@RestController
@RequestMapping("/service")
public class ApplicationController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationController.class);
	
	@RequestMapping(value = "/courses/{course_id}",method = RequestMethod.GET)
    public Course getCourseBuId(@PathVariable("course_id") Integer courseId)
    {
		LOGGER.info("*********************** Inside Course Service getCourseBuId*********************** ");
        return new Course(1, "Bsc-IT", "English");
    }

	@RequestMapping(value = "/courses",method = RequestMethod.GET)
    public List<Course> getAllCourses()
    {
    	LOGGER.info("*********************** Inside Course Service getAllCourses*********************** ");
        List<Course> courseList = new ArrayList<>();

        courseList.add(new Course(1, "Bsc-IT", "English"));
        courseList.add(new Course(2, "Bsc-CS", "English"));
        courseList.add(new Course(3, "Msc-IT", "English"));
        courseList.add(new Course(4, "Zend Certification", "English"));
        return courseList;
    }
   }

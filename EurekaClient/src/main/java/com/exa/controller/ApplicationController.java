package com.exa.controller;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exa.model.Student;

/**
 * @author 43313
 *
 */
@RestController
//@RequestMapping("/student-service")
public class ApplicationController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationController.class);
	
	@RequestMapping(value = "/getName" ,method = RequestMethod.GET)
	public String getName(){
		 LOGGER.info("*********************** Inside Student Service*********************** ");
		return "DemoProject";
	}
	
	
	@RequestMapping(value = "/name" ,method = RequestMethod.GET)
    public String getControllerName()
    {
		 LOGGER.info("*********************** Inside Student Service getControllerName*********************** ");
        return "StudentController - SpringBootDev";
    }

	@RequestMapping(value = "/students/{student_id}",method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("student_id") Integer studentId)
    {
    	 LOGGER.info("*********************** Inside Student Service getStudentById*********************** ");
        return new Student(1, "Chathuranga", "Bsc", "Sri Lanka");
    }


	@RequestMapping(value = "/courses/{course_id}/students" ,method = RequestMethod.GET)
    public List<Student> getStudentsByCourses(@PathVariable("course_id") Integer courseId)
    {
    	 LOGGER.info("*********************** Inside Student Service getStudentsByCourses*********************** ");
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Chathuranga", "Bsc", "Sri Lanka"));
        studentList.add(new Student(2, "Darshana", "Sun Certified", "Sri Lanka"));
        return studentList;
    }


	@RequestMapping(value = "/departments/{department_id}/courses/{course_id}/students" ,method = RequestMethod.GET)
    public List<Student> getStudentsByDepartmentCourses(
            @PathVariable("department_id") Integer departmentId,
            @PathVariable("course_id") Integer courseId) {
    	 LOGGER.info("*********************** Inside Student Service getStudentsByDepartmentCourses*********************** ");
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Chathuranga", "Bsc", "Sri Lanka"));
        studentList.add(new Student(2, "Darshana", "Sun Certified", "Sri Lanka"));
        studentList.add(new Student(3, "Tennakoon", "Zend Certified", "Sri Lanka"));
        return studentList;
    }
}

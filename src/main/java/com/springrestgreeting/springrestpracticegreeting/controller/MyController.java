package com.springrestgreeting.springrestpracticegreeting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.springrest.springrest.services.CourseService;
import com.springrestgreeting.springrestpracticegreeting.entities.Course;
import com.springrestgreeting.springrestpracticegreeting.services.CourseService;

//import com.springrest.springrest.controller.entities.Course;

@RestController
@RequestMapping("/helloController")
public class MyController {

	@Autowired
	private CourseService courseService;
	
	@RequestMapping(value= {"/query"},method=RequestMethod.GET)
	public String sayHello(@RequestParam(value="name")String name) {
		return "Hello " +name+ "!";
	}
	

	@RequestMapping(value= {"","/","/home"})
	public String sayHello() {
		return "Hello World!!";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses();
	}
	
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId)
	{
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseService.addCourse(course);
	}
	
	@PutMapping("/courses/{courseId}")
	public Course editCourse(@PathVariable String courseId,@RequestBody Course course)
	{
		return this.courseService.editCourse(Long.parseLong(courseId),course);
	}
	
	@GetMapping("/coursesdelete/{courseId}")
	public Course deleteCourse(@PathVariable String courseId)
	{
		return this.courseService.deleteCourse(Long.parseLong(courseId));
	}
}

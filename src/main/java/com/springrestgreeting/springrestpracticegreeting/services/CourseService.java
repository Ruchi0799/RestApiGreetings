package com.springrestgreeting.springrestpracticegreeting.services;

import java.util.List;

import com.springrestgreeting.springrestpracticegreeting.entities.Course;


public interface CourseService {

	
	public List<Course> getCourses();

	public Course getCourse(long courseId);

	public Course addCourse(Course course);

	public Course editCourse(long l,Course course);
}

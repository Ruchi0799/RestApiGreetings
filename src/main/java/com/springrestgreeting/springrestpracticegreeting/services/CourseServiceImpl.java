package com.springrestgreeting.springrestpracticegreeting.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrestgreeting.springrestpracticegreeting.entities.Course;



@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	
	CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Course(1,"Ruchi"));
		list.add(new Course(2,"Prachi"));
		
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	
	@Override
	public Course getCourse(long courseId)
	{
		Course c=null;
		for(Course course:list)
		{
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
		}
		return c;
	}
	
//	public Course getCourse() {
//		return this.courseService.getCourse(courseID);
//	}

}

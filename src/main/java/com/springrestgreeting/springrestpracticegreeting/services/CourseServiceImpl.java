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

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}

	@Override
	public Course editCourse(long courseId,Course course) {
		// TODO Auto-generated method stub
		Course c=null;
		for(Course course1:list)
		{
			if(course1.getId()==courseId)
			{
				c=course1;
				//c.setId(c.getId());
				c.setName(course.getName());
				break;
			}
		}
		return c;
		//return null;
	}

	@Override
	public Course deleteCourse(long courseId) {
		// TODO Auto-generated method stub
		
		Course c=null;
		for(Course course2:list)
		{
			if(course2.getId()==courseId)
			{
				c=course2;
				//c.setId(c.getId());
				list.remove(c);
				break;
			}
		}
		return c;
	
	}
	


}

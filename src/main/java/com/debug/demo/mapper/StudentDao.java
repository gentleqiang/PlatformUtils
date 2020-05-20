package com.debug.demo.mapper;

import java.util.List;

import com.debug.demo.entity.Student;

/**
* 类说明
* @author gentleman_qiang
* @version 创建时间：2020年5月20日 上午9:17:19
*/
public interface StudentDao {
   
	 public boolean addStudent(Student student);
	 
	 public boolean deleteStudentById(int id);
	 
	 public List<Student> selectAllStudent();
	 
	 public boolean updateStudent(Student student);
	 
	 public Student selectStudentByName(String name);
	 
	 public Student selectStudentById(int id);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
























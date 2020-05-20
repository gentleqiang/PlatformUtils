package com.debug.demo.entity;
/**
* 类说明
* @author gentleman_qiang
* @version 创建时间：2020年5月20日 上午9:14:01
*/

import java.sql.Date;

public class Student {
    private Integer id;
    private String  name;
    private Date    birth;
    private float   score;
    
	public Student() {
	}

	public Student(Integer id, String name, Date birth, float score) {
		this.id = id;
		this.name = name;
		this.birth = birth;
		this.score = score;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birth=" + birth + ", score=" + score + "]";
	}
	
	
	
	
    
    
}

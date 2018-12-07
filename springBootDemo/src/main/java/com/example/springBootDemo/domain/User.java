package com.example.springBootDemo.domain;

/**
 * @description 
 * @author ShuJinJing
 * @time 2018年12月7日 下午3:54:54 
 */
public class User {
	/**姓名*/
	private String name;
	/**年龄*/
	private int age;
	/**姓名:0-男,1-女*/
	private int sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}
}

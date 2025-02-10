package com.spr1;

public class Student //Beans Class in java 
{
	/**
	 * @param rno
	 * @param name
	 */
	public Student(int rno, String name) { //Parameterized Constructor
		super();
		this.rno = rno;
		this.name = name;
	}
	int rno;
	String name;
	public Student()//Default Constructor
	{
		rno=0;
		name="";
	}
	public int getRno() {//getter & setter
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + "]";
	}
	

}

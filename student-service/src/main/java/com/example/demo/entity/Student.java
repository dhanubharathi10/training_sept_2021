package com.example.demo.entity;

public class Student {
	
	private String studentName;
	private int studentId;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + "]";
	}
	public Student(String studentName, int studentId) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

}

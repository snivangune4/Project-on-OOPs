package com.gl.gradedcodingassignment1;

public class AdminDepartment extends SuperDepartment{

	public String departmentName() {
		String dept= "Admin Department";
		return dept;
	}
	
	public String getTodaysWork() {
		String todaysWork= "Complete your documents submission";
		return todaysWork;
	}
	
	public String getWorkDeadline() {
		String deadline="Complete by EOD ";
		return deadline;
	}
	
	public void displayFunctionalities() {
		System.out.println("Welcome to "+ departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
	}
}

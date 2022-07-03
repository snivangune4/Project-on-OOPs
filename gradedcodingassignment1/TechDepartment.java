package com.gl.gradedcodingassignment1;

public class TechDepartment extends SuperDepartment{

	public String departmentName() {
		String dept= "Tech Department";
		return dept;
	}
	
	public String getTodaysWork() {
		String todaysWork= "Complete coding of module 1";
		return todaysWork;
	}
	
	public String getWorkDeadline() {
		String deadline="Complete by EOD";
		return deadline;
	}
	
	public String getTechStackInformation() {
		String stackInfo="core Java";
		return stackInfo;
	}
	
	public void displayFunctionalities() {
		System.out.println(departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(getTechStackInformation());
		System.out.println(isTodayAHoliday());
	}
}

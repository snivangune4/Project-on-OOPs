package com.gl.gradedcodingassignment1;

public class HrDepartment extends SuperDepartment{

	public String departmentName() {
		String dept= "Hr Department";
		return dept;
	}
	
	public String getTodaysWork() {
		String todaysWork= "Fill today's worksheet and mark your attendance";
		return todaysWork;
	}
	
	public String getWorkDeadline() {
		String deadline="Complete by EOD";
		return deadline;
	}
	
	public String doActivity() {
		String activity="team Lunch";
		return activity;
	}
	
	public void displayFunctionalities() {
		System.out.println(departmentName());
		System.out.println(doActivity());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
	}
}

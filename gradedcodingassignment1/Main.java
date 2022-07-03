package com.gl.gradedcodingassignment1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdminDepartment admin= new AdminDepartment();		
		HrDepartment hr = new HrDepartment();		
		TechDepartment tech = new TechDepartment();
		
		admin.displayFunctionalities();
		System.out.println();		
		hr.displayFunctionalities();
		System.out.println();		
		tech.displayFunctionalities();
	}

}

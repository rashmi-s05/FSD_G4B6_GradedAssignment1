package com.gl.departments.main;

import com.gl.departments.services.AdminDepartment;
import com.gl.departments.services.HrDepartment;
import com.gl.departments.services.TechDepartment;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminDepartment adminDp = new AdminDepartment();		
		System.out.println("Welcome to " + adminDp.departmentName());
		System.out.println(adminDp.getTodaysWork());
		System.out.println(adminDp.getWorkDeadline());
		System.out.println(adminDp.isTodayAHoliday());
		System.out.println();
		
		HrDepartment hrDp = new HrDepartment();
		System.out.println("Welcome to "+ hrDp.departmentName());
		System.out.println(hrDp.doActivity());
		System.out.println(hrDp.getTodaysWork());
		System.out.println(hrDp.getWorkDeadline());
		System.out.println(hrDp.isTodayAHoliday());
		System.out.println();
		
		TechDepartment techDp = new TechDepartment();
		System.out.println("Welcome to "+ techDp.departmentName());
		System.out.println(techDp.getTodaysWork());
		System.out.println(techDp.getWorkDeadline());
		System.out.println(techDp.getTechStackInformation());
		System.out.println(techDp.isTodayAHoliday());
	}

}

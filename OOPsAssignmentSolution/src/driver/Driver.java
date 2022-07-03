package driver;

import department.*;

public class Driver {

	public static void main(String[] args) {
		
		//AdminDepartment
		AdminDepartment admobj = new AdminDepartment();		//AdminDepartment object reference and initialization
		SuperDepartment admobj2 = new AdminDepartment();	//SuperDepartment object, reference to AdminDepartment
		
		//Invoking the methods of Class AdminDepartment
		System.out.println("Welcome to " + admobj.departmentName());
		System.out.println(admobj.getTodaysWork());
		System.out.println(admobj.getWorkDeadline());
		System.out.println(admobj2.isTodayAHoliday() + "\n");// \n for creating a new blank line
		
		//HrDepartment
		HrDepartment hrobj = new HrDepartment();			//HR Department object reference and initialization
		SuperDepartment hrobj2 = new HrDepartment();		//SuperDepartment object, reference to HrDepartment
		
		//Invoking the methods of Class HrDepartment
		System.out.println("Welcome to " + hrobj.departmentName());
		System.out.println(hrobj.getTodaysWork());
		System.out.println(hrobj.getWorkDeadline());
		System.out.println(hrobj.doActivity());
		System.out.println(hrobj2.isTodayAHoliday() + "\n");// \n for creating a new blank line
		
		//TechDepartment
		TechDepartment techobj = new TechDepartment();		//TechDepartment object reference and initialization
		SuperDepartment techobj2 = new TechDepartment();	//SuperDepartment object, reference to TechDepartment
		
		//Invoking the methods of TechDepartment
		System.out.println("Welcome to " + techobj.departmentName());
		System.out.println(techobj.getTodaysWork());
		System.out.println(techobj.getWorkDeadline());
		System.out.println(techobj.getTechStackInformation());
		System.out.println(techobj2.isTodayAHoliday());
		
	}

}

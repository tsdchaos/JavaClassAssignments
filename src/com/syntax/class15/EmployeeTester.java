package com.syntax.class15;

public class EmployeeTester {

	public static void main(String[] args) {
		Employee joe=new Employee();
		Employee jane=new Employee();
		joe.empID=83712;
		jane.empID=37412;
		joe.salary=75000;
		jane.salary=80000;
		System.out.println("Employee "+joe.empID+" has a salary of "+joe.salary+
				" and is employed by "+joe.CEO);
		System.out.println("Employee "+jane.empID+" has a salary of "+jane.salary+
				" and is employed by "+jane.CEO);

	}

}

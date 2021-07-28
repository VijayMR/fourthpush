package org.detail.greens;

import java.util.Scanner;

public class EmployeeDetails {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
			
	System.out.println("Please enter the Employee Id");
	String next = s.next();
	System.out.println("The employee Id is "+next);
	
	System.out.println("Please enter the Employee Name");
	s.nextLine();
	String nextLine = s.nextLine();
	System.out.println("The Employee Name is "+nextLine);
	
	System.out.println("Please enter the Employee phone number");
	String next4 = s.next();
	System.out.println("The Employee phone number is "+next4);
	
	System.out.println("Please enter the Employee Email Id");
	String next3 = s.next();
	System.out.println("The Employee Email Id is "+next3);
	
	System.out.println("Please enter the salary");
	int nextInt = s.nextInt();
	System.out.println("The employee salary is"+nextInt);
	
	System.out.println("Please say True if you are MALE");
	boolean nextBoolean = s.nextBoolean();
	System.out.println( "Are you Male "+nextBoolean);
	
	System.out.println("Please enter the city");
	String next2 = s.next();
	System.out.println("The employee city is "+next2);
	
	System.out.println("Please enter the city");
	String next22 = s.next();
	System.out.println("The employee city is "+next22);
	
	
	
}
}

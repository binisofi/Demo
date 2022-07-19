package emp;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name;
		String Middleinitial;
		int age;
		double salary;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name");
		
		name = input.nextLine();
		System.out.println("Enter your age");
		
		age = input.nextInt();
		 System.out.println("Enter your Salary");
		 salary = input.nextDouble();
		
		System.out.println("Your name: " +name);
		System.out.println("Your age: " +age);
		System.out.println("your salary: " +salary);
		
		
	}

}

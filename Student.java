package Programemp;

import java.util.Scanner;

public class Student {
Scanner sc= new Scanner(System.in);
private String name;
private int rollno;
private float marks;
	
void acceptrecord() {
	System.out.println("Enter name");
	this.name=sc.nextLine();
	System.out.println("Enter rollno");
	this.rollno=sc.nextInt();
	System.out.println("enter marks");
	this.marks=sc.nextFloat();
			}
void displayrecord() {
	System.out.println(this.name);
	System.out.println(this.rollno);
	System.out.println(this.marks);
	
}
	
	public static void main(String[] args) {
		Student s= new Student();
		s.acceptrecord();
		s.displayrecord();
	}

}

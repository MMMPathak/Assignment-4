package Programemp;

public class Vehicle {

	public void car1(String name ,int averge,float speed) {
		System.out.println("The name of car" + name);
		System.out.println("The average of car" + averge);
		System.out.println("The speed of car" + speed);
	}
  public void car1(int capacity,String type) {
	  System.out.println("the capacity of car" + capacity);
	  System.out.println("the type of car is " + type);
  }
public static void main(String[] args) {
	Vehicle v=new Vehicle();
	v.car1("BMW",8,169);
	v.car1(4, "SUV");
	
	
}
}

package Programemp;

public class Employe {
	public void emp(int id,String name,double salary) {
		System.out.println("The emplyoee name" + name);
		System.out.println("The emplyoee id" + id);
		System.out.println("The emplyoee salary" + salary);
	}
	
	public void emp(String address,int age) {
		System.out.println("The emplyoee age" + age);
		System.out.println("The emplyoee address" + address);
	}
	
	public void emp(int mobilenumber,String hobby) {
		System.out.println("The emplyoee mobilenumber" + mobilenumber);
		System.out.println("The emplyoee hobby" + hobby);
	}
	
	
	public static void main(String[] args) {
	 
		Employe e= new Employe();
		e.emp(123,"Mrunmayi pathak",35000);
		e.emp("Pune", 22);
		e.emp(89787783, null);
		
	}

}

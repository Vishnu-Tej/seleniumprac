package basic;

public class Employee {

	String name;
	int age;
	Boolean isPermanent;
	String city;
	int dob;
	
	public Employee(){
		System.out.println("default constructor");
	}
	public Employee(String name){
	}
	
	public Employee(String name,int age){
		System.out.println("Two paraconstrustor");
	}
	public Employee(int a){
		System.out.println("1 para constructor");
	}
	
	public static void main (String args[]){
	Employee e1= new Employee("test",10);
	System.out.println(e1.name + " "+ e1.age);
	//System.out.println(e1.name);
	
	Employee e2 = new Employee("tom");
	
	}
	
	
}

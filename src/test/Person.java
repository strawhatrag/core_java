package test;

public class Person {
	
	public String Name;
	public int Age;
	public String City;
	
	public Person() {
		
		
	}
	
	public Person(String name, String city, int age) {
		
		this.Name = name;
		this.City = city;
		this.Age = age;
	}
	
	public void display() {
		
		System.out.println("name is: " + Name);
		System.out.println("age is: " + Age);
		System.out.println("city is: " + City);
	}
	

}

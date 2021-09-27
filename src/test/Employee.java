package test;

public class Employee extends Person {
	
	public int EmpID;
	public int Salary;
	String department;
	
	
	public Employee() {
		
		super();
		System.out.println("inside emp cons");

	}
	public Employee(int empID, int salary) {
		
		this();
		
		this.EmpID = empID;
		this.Salary = salary;

	}
	
	public Employee(String name, int age, int salary,String city){
		
		super(name,city,age);
		
		this.Name = name;
		this.Age = age;
		this.Salary = salary;
		this.City = city;
		
	}
	

	public void display() {
		
		System.out.println("emp id is: " + EmpID);
		System.out.println("salary is: " + Salary);
		System.out.println("dep is: " + department);
	}

}
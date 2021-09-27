package test;

import test.Employee;
public class Runnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee();
		
		emp1.EmpID = 4567;
		emp1.Salary = 5000;
		emp1.department = "it";
		emp1.display();
		
		
		Employee emp2 = new Employee(3214,3000);
		emp2.display();
		
		Employee emp3 = new Employee("rag",22,10000,"bangalore");
		emp3.display();
		
		
		
		PolymorphismExample obj1 = new PolymorphismExample();
		
		obj1.add(12,18);
		obj1.add(3,8,3);
		obj1.add(12.4,18.3);
		
		
		
		

	}

}
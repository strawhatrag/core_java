package test;

public class ThrowExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age =17;
		
		
		ThrowExamples obj = new ThrowExamples();
		
		try {
		obj.ageCheck(age);
		
		}catch(ArithmeticException e) {
			
		System.out.println("Exception");
		}

		System.out.println("after exception");
		
	}
	
	public void ageCheck(int age) {
		if(age<18) {
			
			throw new ArithmeticException("age not allowed");
			
		}else {
			System.out.println("Eligible");
		}
	}
	
	

}

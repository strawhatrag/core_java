package test;

public class ExceptionHandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int a = 10;
		
		int b[]= {1,2,3};
		
		try {
			System.out.println(b[5]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();
			System.out.println(" inside ArrayIndex Out Of Bounds Exception exception");
			
		}catch(ArithmeticException e) {
			
			e.printStackTrace();
			System.out.println(" inside Arithemtic exception");
			
		}catch(Exception e) {
			
			e.printStackTrace();
			System.out.println(" inside generic exception");
			
		}finally {
			System.out.println("inside finally");
		}
		
		System.out.println("after exception");

	}

}

package test;

public class switchExample {
	
	public static void main(String[] args) {
		
		
		int age = 19;
		
		switch(age) {
		
		case 19:
		case 18:
			System.out.println("Eligible");
			break;
		case 17:
			System.out.println("will be  eligible in next yr");
			break;
		case 15:
			System.out.println("Ineligible");
			break;
		default:
			System.out.println("Default block");
			
		}

	}
}
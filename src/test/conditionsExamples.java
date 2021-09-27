package test;

public class conditionsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=50;i++) {
			
			if(i%2 ==0) {
				
				System.out.println("even: "+i);
			}else {
				System.out.println("odd:"+i);
			}
		}
		//========================================
			
			
			
		int age =18;//eligible
		age =17; //u will be eligible nxt yr
		age = 16; //ur not eligible
		
		
		if(age>=18) {
			System.out.println("eligible");
		}else if(age==17) {
			System.out.println("u will be eligible nxt yr");
		}else{
			System.out.println("ur not eligible");
		}
		
		
		
			
		

	}

}

package test;

public class LoopingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i;
		
		int[] array1 = {1,23,45,34,12};
		
		String Str1 = "clean india  green india";
		String revrStr = "";
		
		
		//=======basic for loop==========================
		/*
		int i;
		int l = array1.length;
		
		for(i=1;i<l;i++) {
			
			System.out.println(array1[i]);
		}
		*/
		
		
//		for (int values:array1) {
//			
//			System.out.println(values);
//		}
		
		//==================reverse string==================
//		for(int j=1;j<Str1.length();j++) {
//			
//			System.out.println(Str1.charAt(j));
//		}
		
		for(int k=Str1.length()-1;k>=0;k--) {
			revrStr += Str1.charAt(k);
		}
		
			
		System.out.println("Reversed string : "+revrStr);
		//====================================================
		
		
		String[] words = Str1.trim().split(" ");
		System.out.println("total words are :"+words.length);
		
		//==============while loop=============================
//		
//		int x=1;
//		while(x<=10) {
//			
//			System.out.println(x);
//			
//			x++;
//		}
		
		//====================Print the digits using while loop==========================
		
		
		int n1 = 23435;
		
		while(n1>0) {
			
			int r = n1%10;              
			System.out.println(r);
			
			n1 = n1/10; //2343.5,234.35 returns the last number skipping the decimal
			
		}
		//===============================================================================
		
		
		
		
		
		
		
		
	
		
	}

}

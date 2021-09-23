package test;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class calcArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int l, b;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("enter length: ");
		l = scan.nextInt();
				
		System.out.println("enter breadth: ");
		b = scan.nextInt();
		
		
		
		int area = l*b;
		
	    System.out.println("area of rectange :"+area);
		
		
		
		

	}

}

package test;

public class stringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String FName = "srirag";
		String LName = "urupurath";
		
		
		String FullName = FName + " "+ LName;
		
		System.out.println("Full name is : "+FullName);
		
		System.out.println("Length of  Full name is : "+FullName.length());
		System.out.println("Full name in AllCaps : "+FullName.toUpperCase());
		
		String NewName = FullName.replace(" ",",");
		
		System.out.println("New name is  : "+ NewName);
	}

}

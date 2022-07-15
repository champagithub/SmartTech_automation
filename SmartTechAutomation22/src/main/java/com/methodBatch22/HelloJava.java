package com.methodBatch22;

public class HelloJava {
	
	
	static int a=5;//static variable 
	int b=6; //instance variable 
	

	
	public void getaddsalary() {
		int c=55;
		System.out.println("Value of c =>"+c);
		
	}
public static void main(String[] args) {
HelloJava obj =new HelloJava();
	
	obj.getaddsalary();//55
	
	
	
	
	
	String varname="Ranjan";
	
	System.out.println("Value of local variable inside main method :=>"+varname);//Ranjan
	System.out.println("Value of instance variable:=>"+obj.b);
    System.out.println("Value of Static Variable:=>"+a);
}
		
			
		
	}	
	

	

	


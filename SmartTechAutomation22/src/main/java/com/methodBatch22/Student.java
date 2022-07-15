package com.methodBatch22;

public class Student {
//print line with forloop
	public static void displayLine(){
		
	      for (int i = 1; i <= 80; i++)
	      {
	         System.out.print("_");
	      }

	      System.out.println(" ");
	   }
	
	public static void main(String[] args) {
	for (int i=0;i<=20;i++) {
		
		System.out.println(i);
	}
	
	Student.displayLine();
	
	
	
	}
}

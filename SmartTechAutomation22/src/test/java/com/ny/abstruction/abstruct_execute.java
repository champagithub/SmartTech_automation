package com.ny.abstruction;

public class abstruct_execute  extends Abstruct_Test{

	@Override
	public void getname() {
		System.out.println("complete method");
		
	}
public static void main(String[] args) {
	abstruct_execute obj=new abstruct_execute();
	obj.getname();
	obj.getEmployeeInfo();
	
}
	
}

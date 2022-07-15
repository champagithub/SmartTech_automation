package Peactice_Batch27;

public class Addition_Substraction {
	public static void main(String[] args) {
		Addition_Substraction obj= new Addition_Substraction();
		obj.addition(20, 60);
		obj.substraction(50, 25);
		obj.devided(50, 5);
		
	}
	
	
	public void addition(int a, int b) {
		System.out.println(a+b);
	}
public void substraction(int a, int b) {
	System.out.println(a-b);
}
public void devided(int a,int b) {
	System.out.println(a/b);
}
}


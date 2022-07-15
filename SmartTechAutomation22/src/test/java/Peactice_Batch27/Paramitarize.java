package Peactice_Batch27;

public class Paramitarize {
	public static void main(String[] args) {
		Paramitarize obj=new Paramitarize ();
		obj.para1("champa");
		obj.nonPARA();
		System.out.println(obj.para1("My name is "+"Champa"));
	}
	public String para1(String FirstName) {
		return FirstName;
	}
public static void nonPARA() {
	System.out.println("Mylast name is Nandi");
	
}
}

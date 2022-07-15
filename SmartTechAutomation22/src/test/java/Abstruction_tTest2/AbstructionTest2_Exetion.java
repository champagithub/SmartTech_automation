package Abstruction_tTest2;

public class AbstructionTest2_Exetion extends AbstructionTest_Practice {
	
	public static void main(String[] args) {
		AbstructionTest2_Exetion obj= new AbstructionTest2_Exetion ();
		obj.getEmployee();
		System.out.println("This is abstruction");
		
	}

	@Override
	public void getEmployee() {
		System.out.println("This is Complete");
		
	}

}

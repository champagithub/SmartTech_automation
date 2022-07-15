package Peactice_Batch27;

public class inherrit_chld_AavingAccount extends inherrit_PRN_CheckingAccount {
	public static void main(String[] args) {
		inherrit_chld_AavingAccount obj =new inherrit_chld_AavingAccount ();
		obj.getbank();
		obj.getmoney();
		obj.getChecking();
		obj.savingAccount();
	}

	
	
	
	
	protected void savingAccount() {
		System.out.println("this is child savings");
		
	}
	protected void getmoney() {
		System.out.println("child get monney from parent");
	}
}

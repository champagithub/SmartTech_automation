package Peactice_Batch27;

public class inherrit_multi extends inherrit_chld_AavingAccount {
	
	public static void main(String[] args) {
		inherrit_multi	 objmulti = new 	inherrit_multi();
		objmulti.getbank();
		objmulti.getChecking();
		objmulti.getmoney();
		objmulti.savingAccount();
		objmulti.creditCard();
		
	}
	
	
	
	public void creditCard() {
		System.out.println("i have credit card $1000");
		
	}

}

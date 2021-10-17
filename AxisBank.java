package week3.day1;

public class AxisBank extends BankInfo {
	
	@Override
	public void deposit() {
		System.out.println("Amount can be Deposit here");
	}
	
	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.deposit();
		obj.saving();
		obj.fixed();
	}

}

package java1212;

public class method2 {

	public static void dutchPay(int totalPay, int cnt) {
		int dutchPayMoney = (int) Math.ceil((float)totalPay / cnt);
		System.out.println("일인당 부담 금액 : " + dutchPayMoney);
	}
	
	
	public static void main(String[] args) {
		dutchPay(1000, 3);
	}

}

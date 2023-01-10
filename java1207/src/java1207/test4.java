package java1207;

import java.text.NumberFormat;
import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("구매금액을 입력하시오 : ");
		int buy = scan.nextInt();
		int charge;
		
		if(buy >= 300000) {
			charge = buy - 30000;
		}
		else if(buy >= 100000) {
			charge = buy - 5000;
		}
		else {
			charge = buy;
		}
		
		System.out.println("구매금액 : " + NumberFormat.getInstance().format(buy) + "원");
		System.out.println("청구금액 : " + NumberFormat.getInstance().format(charge) + "원");
		
		scan.close();
	}

}

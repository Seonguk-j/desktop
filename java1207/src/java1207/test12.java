package java1207;

import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int beforeM;
		int thisM;
		int interest;
		int total;
		int min;
		
		System.out.print("미결제금액을 입력하세요 : ");
		beforeM = scan.nextInt();
		System.out.print("당월 사용금액을 입력하세요 : ");
		thisM = scan.nextInt();
		if(beforeM > 0) {
			interest = (int)((beforeM + thisM) * 0.02);
		}
		else {
			interest = 0;
		}
		
		total = thisM + beforeM + interest;
		
		if(total < 100000) {
			min = total;
		}
		else if(total < 300000) {
			min = 100000;
		}
		else {
			min = (int)(total * 0.2);
		}
		
		System.out.println();
		System.out.println("미결제금액 : " + beforeM + "원");
		System.out.println("당월 사용금액 : " + thisM + "원");
		System.out.println("연체이자 : " + interest + "원");
		System.out.println();
		System.out.println("입금해야 할 총금액 : " + total + "원");
		System.out.println("최소입금액 : " + min + "원");
		
		scan.close();
	}

}

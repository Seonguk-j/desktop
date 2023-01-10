package java1207;

import java.text.NumberFormat;
import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("연간 근로소득을 입력하시오(단위 : 만원) : ");
		int income = scan.nextInt();
		double tax;
		
		if(income <= 2000) {
			tax = income * 0.05;
		}
		else if(income <= 4000) {
			tax = income * 0.15;
		}
		else if(income <= 8000) {
			tax = income * 0.25;
		}
		else {
			tax = income * 0.4;
		}
		
		System.out.println("연간 근로소득 : " + NumberFormat.getInstance().format(income) + "만원");
		System.out.println("연간 근로소득세 : " + NumberFormat.getInstance().format(tax) + "만원");
		scan.close();
	}

}

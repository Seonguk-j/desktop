package java1207;

import java.text.NumberFormat;
import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int total;
		int cost = 100000;
		int cnt;
		System.out.print("구입할 갯수를 입력하시오 : ");
		cnt = scan.nextInt();
		
		if(cnt >= 10) {
			total = (int)(cost * cnt * 0.9);
		}
		else {
			total = cost * cnt;
		}
		
		System.out.println("총 가격은 " + NumberFormat.getInstance().format(total) + "입니다.");
		scan.close();
	}

}

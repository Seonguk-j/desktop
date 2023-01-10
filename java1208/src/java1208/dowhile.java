package java1208;

import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		//상품 가격들의 합이 100,000을 초과할 때까지 상품 가격들을 계속 읽어 들이는 프로그램
		Scanner scan = new Scanner(System.in);
		
		int price;
		int total = 0;		//합계를 0으로 초기화
		
		//구매한 상품 가격들의 합계가 100000을 초과할 때까지 반복
		do {
			System.out.print("상품의 가격을 입력하세요 : ");
			price = scan.nextInt();
			
			//합계를 구함
			total += price;
		} while(total <= 100000);
		System.out.println("총 금액은 " + total + "입니다.");
		scan.close();
	}

}

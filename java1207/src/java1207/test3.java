package java1207;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오 : ");
		int x = scan.nextInt();
		
		if(x % 3 == 0) {
			System.out.println("3의 배수이다.");
		}
		else if(x % 5 == 0) {
			System.out.println("5의 배수이다.");
		}
		else if(x % 8 == 0) {
			System.out.println("8의 배수이다.");
		}
		else {
			System.out.println("어느 배수도 아니다.");
		}
		
		scan.close();
	}

}

package java1207;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이를 입력해 주세요 : ");
		int age = scan.nextInt();
		
		if(age >= 19) {
			System.out.println("영화를 볼 수 있습니다.");
		}
		else if(age >= 15) {
			System.out.println("성인이 동반한 경우에만 영화를 볼 수 있습니다");
		}
		else {
			System.out.println("영화를 볼 수 없습니다");
		}
		
		scan.close();
	}

}

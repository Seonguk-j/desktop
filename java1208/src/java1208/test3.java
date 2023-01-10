package java1208;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		int finish;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("목표값(1 ~ 10사이의 정수)을 입력하세요 : ");
		finish = scan.nextInt();
		
		System.out.println("값\t합");
		for(int i = 1; i <= finish; i++) {
			sum += i;
			System.out.println(i + "\t" + sum);
		}
		scan.close();
	}

}

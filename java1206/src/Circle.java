

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		//원의 면적 구하는 프로그램
		final double PI = 3.14159;
		double radius, area;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("원의 반지름을 입력하세요: ");
		radius = scan.nextDouble();
		
		area = PI * radius * radius;
		System.out.println("원의 반지름은 "+ radius + "이다.");
		System.out.println("원의 면적은 " + area + "이다.");
	}

}

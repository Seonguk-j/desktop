package java1212;

import java.util.Scanner;

public class method3 {
	
	public static int sum(int num) {
		if(num > 0)	num += sum(num - 1);
		return num;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("계산할 값을 입력하세요 : ");
		int N = scan.nextInt();
		System.out.println(N + "까지의 정수 합 : " +sum(N));
		scan.close();
	}

}

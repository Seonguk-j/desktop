package java1212;

import java.util.Scanner;

public class test3 {

	public static void nPlu(int x, int y) {
		System.out.println("두수의 합은 : " + (x + y));
	}
	
	public static void nMin(int x, int y) {
		System.out.println("두수의 차는 : " + (x - y));
	}
	public static void nTim(int x, int y) {
		System.out.println("두수의 곱은 : " + (x * y));
	}
	public static void nDiv(int x, int y) {
		System.out.println("두수의 나누기는 : " + ((double)x / y));
	}
	
	public static void nPlu(int x, int y, int z) {
		System.out.println("수의 합은 : " + (x + y + z));
	}
	public static void nMin(int x, int y, int z) {
		System.out.println("수의 차는 : " + (x - y - z));
	}
	public static void nTim(int x, int y, int z) {
		System.out.println("수의 곱은 : " + (x * y * z));
	}
	public static void nDiv(int x, int y, int z) {
		System.out.println("수의 나누기는 : " + ((double)x / y / z));
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] arrStr;
		int[] arrInt = null;
		
		System.out.print("두 수 또는 세개의 수를 입력하세요 : ");
		String str = scan.nextLine();
		
		arrStr = str.split(" ");
		arrInt = new int[str.length()];
		
		for(int i = 0; i < arrStr.length; i++) {
			arrInt[i] = Integer.parseInt(arrStr[i]);
		}
		
		if(arrInt.length == 2) {
			nPlu(arrInt[0], arrInt[1]);
			nMin(arrInt[0], arrInt[1]);
			nTim(arrInt[0], arrInt[1]);
			nDiv(arrInt[0], arrInt[1]);
		}
		else {
			nPlu(arrInt[0], arrInt[1], arrInt[2]);
			nMin(arrInt[0], arrInt[1], arrInt[2]);
			nTim(arrInt[0], arrInt[1], arrInt[2]);
			nDiv(arrInt[0], arrInt[1], arrInt[2]);
		}
		
		scan.close();
	}

}

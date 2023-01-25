package asciiCode;

import java.util.Scanner;

public class Problem_02908 {

	static int output;
	static int A;
	static int B;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		A = scan.nextInt();
		B = scan.nextInt();
		
		finder(A, B);
		
		for(int i = 0; i < 3; i++) {
			System.out.print(output % 10);
			output /= 10;
		}
		scan.close();
	}

	static void finder(int num1, int num2) {
		int tempA = num1 % 10;
		int tempB = num2 % 10;
		if(tempA == tempB)
			finder(num1 / 10, num2 / 10);
		else if(tempA > tempB)
			output = A;
		else
			output = B;
	}
}

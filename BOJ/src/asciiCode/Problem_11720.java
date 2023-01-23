package asciiCode;

import java.util.Scanner;

public class Problem_11720 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());
		int sum = 0;
		String num = scan.nextLine();
		char[] arr = num.toCharArray();
		for(int i = 0; i < N; i++) {
			sum += arr[i] - 48;
		}
		System.out.println(sum);
		scan.close();
	}

}

package asciiCode;

import java.util.Scanner;

public class Problem_01316 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int cnt = N;
		
		for(int i = 0; i < N; i++) {
			String str = scan.next();
			boolean[] check = new boolean[26];
			char[] arr = str.toCharArray();
			for(int j = 0; j < arr.length; j++) {
				if(j == 0)
					check[arr[j] - 97] = true;
				else if(check[arr[j] - 97] && arr[j - 1] != arr[j]) {
					cnt--;
					break;
				}
			}
		}
		System.out.println(cnt);
		scan.close();
	}

}

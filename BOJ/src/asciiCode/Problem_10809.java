package asciiCode;

import java.util.Scanner;

public class Problem_10809 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char[] alphabet = str.toCharArray();
		int[] arr = new int[26];
		for(int i = 0; i < 26; i++) {
			arr[i] = -1;
		}
		for(int i = 0; i < alphabet.length; i++) {
			int temp = alphabet[i] - 97;
			if(arr[temp] == -1)
				arr[temp] = i;
		}
		for(int i = 0; i < 26; i++) {
			System.out.print(arr[i] + " ");
		}
		scan.close();
	}

}

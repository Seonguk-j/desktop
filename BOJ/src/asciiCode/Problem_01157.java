package asciiCode;

import java.io.*;

public class Problem_01157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		char[] arr = str.toCharArray();
		int[] cnt = new int[26];
		int max = 0;
		int check = 0;
		char output = '?';
		
		for(int i = 0; i < arr.length; i++) {
			cnt[arr[i] - 65]++;
			max = Math.max(max, cnt[arr[i] - 65]);
		}
		
		for(int i = 0; i < 26; i++) {
			if(cnt[i] == max) {
				output = (char) (i + 65);
				check++;
			}
			if(check > 1) {
				output = '?';
				break;
			}
		}
		System.out.println(output);
	}

}

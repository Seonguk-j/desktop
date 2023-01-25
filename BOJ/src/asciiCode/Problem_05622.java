package asciiCode;

import java.io.*;

public class Problem_05622 {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		char[] arr = input.toCharArray();
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += timer(arr[i]);
		}
		System.out.println(sum);
	}
	
	static int timer(char character) {
		int time;
		if(character <= 67)
			time = 3;
		else if(character <= 70)
			time = 4;
		else if(character <= 73)
			time = 5;
		else if(character <= 76)
			time = 6;
		else if(character <= 79)
			time = 7;
		else if(character <= 83)
			time = 8;
		else if(character <= 86)
			time = 9;
		else
			time = 10;
		return time;
	}

}

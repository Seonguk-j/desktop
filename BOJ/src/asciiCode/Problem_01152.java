package asciiCode;

import java.io.*;

public class Problem_01152 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		if(str.equals(" "))
			System.out.println(0);
		else {
			str = str.trim();
			String[] arr = str.split(" ");
			System.out.println(arr.length);
		}
	}

}

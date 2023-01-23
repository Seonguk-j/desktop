package asciiCode;

import java.io.*;
import java.util.*;

public class Problem_02675 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int cnt = Integer.parseInt(st.nextToken());
			while(st.hasMoreTokens()) {
				char[] temp = st.nextToken().toCharArray();
				for(int j = 0; j < temp.length; j++) {
					for(int k = 0; k < cnt; k++) {
						bw.write(temp[j]);
					}
				}
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}

/*
 * 1. case수 입력받음(case수만큼 반복)
 * 2. 책 권수 N, 사람수 M입력받음
 * 3. Point(x, y)에 책 범위 입력받음
 * 4. x기준 오름차순, y기준 오름차순 정렬
 * 5. x비교해서 boolean check[x]가 false면 count++, check[x] true로 변경
 * 6. check[x] true면 x가 y이하일때 까지 x++
 */
import java.io.*;
import java.util.*;

public class Problem_09576 {

	static int[][] arr;
	static int cnt;
	static boolean[] check;
	static int N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int caseNum = Integer.parseInt(br.readLine());
		for(int i = 0; i < caseNum; i++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			arr = new int[M][2];
			check = new boolean[N];
			
			for(int j = 0; j < M; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				arr[j][0] = x;
				arr[j][1] = y;
			}
			
			Arrays.sort(arr, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					if(o1[1] == o2[1]) return o2[0] - o1[0];
					return o1[1] - o2[1];
				}
			});
						
			cnt = 0;
			for(int j = 0; j < M; j++) {
				checkBook(arr[j][0], arr[j][1]);
			}
			bw.write(cnt +"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	static void checkBook(int bookNum, int lastNum) {
		if(!check[bookNum - 1]) {
			cnt++;
			check[bookNum - 1] = true;
		}
		else {
			if(cnt != N && bookNum + 1 <= lastNum)
				checkBook(bookNum + 1, lastNum);
		}
	}

}
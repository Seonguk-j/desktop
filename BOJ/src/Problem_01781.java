/*
 * 컵라면
 *  1. 갯수 n입력받음
 *  2. arr[n][0]에 라면수, arr[n][1]에 데드라인 입력받음
 *  3. 라면수 기준 내림차순, 데드라인 기준 오름차순 정렬
 *  4. arrList의 크기와 데드라인 비교하며 arrList의 크기가 데드라인보다 작을경우 값 추가
 *  5. 최종합
 */
import java.util.*;
import java.io.*;

public class Problem_01781 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		boolean[] output = new boolean[n];
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) return o1[1] - o2[1];
				return o2[1] - o1[1];
			}
		});
		for(int i = 0; i < n; i++) {
			int temp = arr[i][0] - 1;
			while(output[temp] && temp != 0) {
				temp--;
			}
			if(!output[temp]) {
				sum += arr[i][1];
				output[temp] = true;
			}
		}
		
		System.out.println(sum);
		
		br.close();
	}

}

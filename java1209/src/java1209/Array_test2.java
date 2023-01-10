package java1209;

public class Array_test2 {

	public static void main(String[] args) {
		int[][] arr = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum = 0;
		int cnt = 0;
		double avg;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j : arr[i]) {
				sum += j;
				cnt++;
			}
		}
		avg = sum / (double)cnt;
		System.out.println("전체 합 : " + sum);
		System.out.println("평균 : " + avg);
	}

}

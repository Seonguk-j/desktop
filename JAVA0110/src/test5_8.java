
public class test5_8 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum = 0;
		int cnt = 0;
		
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				cnt++;
			}
		}
		
		double avg = (double) sum / cnt;
		System.out.println("점수의 총합 = " + sum);
		System.out.println("총 인원 = " + cnt);
		System.out.println("전체 평균 = " + avg);
	}

}

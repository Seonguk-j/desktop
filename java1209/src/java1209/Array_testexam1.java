package java1209;

public class Array_testexam1 {

	static int[][] scores = {
			{80, 90, 96},		//A반 학생 점수
			{76, 88}			//B반 학생 점수
	};
	
	public static void main(String[] args) {
		
		//출력
		//총 반 수 : 2
		//A반의 학생수 : 3
		//B반의 학생수 : 2
		//각반의 마지막 학생의 점수 : 출력
		//A반의 평균 점수 : 
		//B반의 평균 점수 :
		//전체 학생의 평균 점수
		
		int[] sum = new int[scores.length];
		int sumTotal = 0;
		double[] avg = new double[scores.length]; 
		double avgTotal;
		int cnt = 0;
		
		for(int i = 0; i < scores.length; i++) {
			for(int j : scores[i]) {
				sum[i] += j;
				cnt++;
			}
			avg[i] = sum[i] / (double)scores[i].length;
			sumTotal += sum[i];
		}
		avgTotal = sumTotal / (double)cnt;
		
		System.out.println("총 반 수 : " + scores.length);
		System.out.println("A반의 학생수 : " + scores[0].length);
		System.out.println("B반의 학생수 : " + scores[1].length);
		System.out.println("각 반의 마지막 학생의 점수 : A반 " + lastStudent(0) + ", B반 " + lastStudent(1));
		System.out.println("A반의 평균 점수 : " + avg[0]);
		System.out.println("B반의 평균 점수 : " + avg[1]);
		System.out.println("전체 학생의 평균 점수 : " + avgTotal);
	}
	
	static int lastStudent(int x) {
		return scores[x][scores[x].length - 1];
	}

}

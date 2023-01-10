
public class quiz_01 {

	public static void main(String[] args) {
		quizCalc calc = new quizCalc();
		int[] arr = {88,97,100,67,55,89};
		int total = calc.sum(arr);
		double average = calc.avg(arr);
		
		System.out.println("점수의 총 합 : " + total);
		System.out.println("평균 점수 : " + average);
		
	}

}

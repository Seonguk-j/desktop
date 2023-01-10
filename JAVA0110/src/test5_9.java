import java.util.Scanner;

public class test5_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		boolean finish = true;
		int student = 0;
		int[] scores = null;
		int max = 0;
		int sum = 0;
		
		while(finish) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			num = scan.nextInt();
			
			switch(num) {
				case 1:
					System.out.print("학생수> ");
					student = scan.nextInt();
					scores = new int[student];
				break;
				case 2:
					for(int i = 0; i < student; i++) {
						System.out.print("scores[" + i + "]> ");
						scores[i] = scan.nextInt();
					}
				break;
				case 3:
					for(int i = 0; i < student; i++) {
						System.out.printf("scores[%d]: %d\n", i, scores[i]);
					}
				break;
				case 4:
					for(int i = 0; i < student; i++) {
						max = Math.max(max, scores[i]);
						sum += scores[i];
					}
					System.out.println("최고 점수: " + max);
					System.out.println("평균 점수: " + ((double) sum / student));
				break;
				case 5:
					finish = false;
				break;
				default:
					System.out.println("입력값이 잘못되었습니다.");
					
			}
				
		}
		scan.close();
	}

}

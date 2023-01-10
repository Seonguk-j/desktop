package java1207;

import java.util.Scanner;

public class DetermineAppType {

	public static void main(String[] args) {
		
		double grade;
		int Toeic;		//토익 점수를 지정하는 변수를 선언한다.
		
		//Scanner 객체를 생성하고 scan이 가리키게 한다.
		Scanner scan = new Scanner(System.in);
		
		//평점을 입력 받는다.
		System.out.print("평점을 입력하세요 : ");
		grade = scan.nextDouble();
		
		//토익 점수를 입력받는다.
		System.out.print("TOEIC 점수를 입력하세요 : ");
		Toeic = scan.nextInt();
		
		//평점과 토익 점수에 따라 적절한 메시지를 출력한다.
		if(Toeic >= 700 && grade >= 3.0) {
			if(grade >= 4.0) {
				System.out.println("면접 대상입니다.");
			}
			else if(grade >= 3.5) {
				System.out.println("서류 전형 대상입니다.");
			}
			else {
				System.out.println("필기 시험 대상입니다.");
			}
		}
		else {
			System.out.println("지원 할 수 없습니다.");
		}
		scan.close();
	}

}

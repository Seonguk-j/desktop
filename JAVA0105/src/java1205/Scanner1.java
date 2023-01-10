package java1205;

import java.util.Scanner;					// Scanner 라는 입력 클래스 호출

public class Scanner1 {

	public static void main(String[] args) {
		//주행 거리에 따른 연비 계산
		double driveDistance;		//주행 거리
		double fuels;				//사용한 휘발유 양
		double fuelEfficiency;		//연비
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("주행거리를 입력하세요: ");
		driveDistance = scan.nextDouble();
		System.out.print("사용한 휘발유 양을 입력하세요: ");
		fuels = scan.nextDouble();
		fuelEfficiency = driveDistance / fuels;
		System.out.println("연비: " + fuelEfficiency);
	}

}

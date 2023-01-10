

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int eng, prog, math, comp;
		double avg;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("영작문:\t\t");
		eng = scan.nextInt();
		System.out.print("프로그래밍:\t");
		prog = scan.nextInt();
		System.out.print("이산수학:\t\t");
		math = scan.nextInt();
		System.out.print("컴퓨터구조:\t");
		comp = scan.nextInt();
		System.out.println();
		
		avg = (eng + prog + math + comp) / 4;
		System.out.println("평균 점수:\t\t" + avg);
	}

}

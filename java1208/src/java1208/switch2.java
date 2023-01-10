package java1208;

import java.util.Scanner;

public class switch2 {

	public static void main(String[] args) {
		//YES/yes/NO/no
		Scanner scan = new Scanner(System.in);
		
		System.out.print("YES/yes 또는 NO/no를 입력하세요 : ");
		String yn = scan.nextLine();
		
		switch(yn) {
		case "YES" :
		case "yes" :
			System.out.println("Yes를 선택하셨습니다!");
			break;
		case "NO" :
		case "no" :
			System.out.println("No를 선택하셨습니다!");
			break;
		default :
			System.out.println("입력이 잘못 되었습니다.");
		}
		scan.close();
	}

}

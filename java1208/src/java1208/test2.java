package java1208;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		String input;
		
		Scanner scan = new Scanner(System.in);
		int i = 0;
		 do {
			if(i < 3) {
				System.out.print("암호를 입력하세요 : ");
				input = scan.next();
				if(input.equals("codehows")) {
					System.out.println("환영합니다");
					break;
				}
				else if(i < 2) {
					System.out.println("암호가 틀립니다. " + (2 - i) + "회 남았습니다.");
				}
			}
			else {
				System.out.println("접속을 거부합니다");
			}
			i++;
		} while(i <= 3);
		scan.close();
	}

}

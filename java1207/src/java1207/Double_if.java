package java1207;

import java.util.Scanner;

public class Double_if {
	static String email, password;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("email을 입력하세요 : ");
		email();

		System.out.print("password를 입력하세요 : ");
		password = scan.nextLine();
		check(password);
		
		System.out.println("회원가입을 축하드립니다!");
		scan.close();
	}
	
	static void email() {
		Scanner scan = new Scanner(System.in);
		email = scan.nextLine();

		if(email.contains("@")) {
			System.out.println("email확인이 완료되었습니다.");
		}
		else {
			System.out.print("이메일 주소를 다시 입력해주세요 : ");
			email();
		}
		scan.close();
	}
	
	static void check(String password) {
		String doubleCheck;
		Scanner scan = new Scanner(System.in);
		System.out.print("password를 한번 더 입력하세요 : ");
		doubleCheck = scan.nextLine();
		if(password.equals(doubleCheck)) {
			System.out.println("확인이 완료되었습니다.");
		}
		else {
			System.out.println("비밀번호가 일치하지 않습니다.");
			check(password);
		}
		scan.close();
	}
}

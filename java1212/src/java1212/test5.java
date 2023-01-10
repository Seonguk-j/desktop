/*
 * 1. 문자열 입력받는다.
 * 2-1. 문자(영 대소문자)가 포함될 경우 boolean en = true
 * 2-2. 숫자가 포함될 경우 boolean num = true
 * 2-3. 문자열의 길이가 10 이상일 경우 boolean cnt = true
 * 3. 셋중 하나라도 false인 경우 암호 유효하지 않다, 이유 출력
 */
package java1212;

import java.util.Scanner;

public class test5 {
	
	public static int recursionNum(String str, int num) {
		int cnt = 0;
		if(num > 0) {
			char character = str.charAt(num - 1);
			if(character >= 48 && character <= 57) 
				cnt = 1 + recursionNum(str, num - 1);
			else 
				cnt = recursionNum(str, num - 1);
		}
		return cnt;
	}
	
	public static int recursionChar(String str, int num) {
		int cnt = 0;
		if(num > 0) {
			char character = str.charAt(num - 1);
			if((character >= 65 && character <= 90) || (character >= 97 && character <= 122)) 
				cnt = 1 + recursionChar(str, num - 1);
			else 
				cnt = recursionChar(str, num - 1);
		}
		return cnt;
	}

	public static void main(String[] args) {
		
		boolean cnt = false;
		boolean num = false;
		boolean en = false;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("암호를 입력하세요 : ");
		String str = scan.nextLine();
		System.out.println("입력된 암호 : " + str);
		
		if(str.length() >= 10) cnt = true;
		if(recursionNum(str, str.length()) >= 4) num = true;
		if(recursionChar(str, str.length()) > 0) en = true;
		
		if(cnt && num && en)
			System.out.println("암호가 유효합니다.");
		else {
			System.out.println("암호가 유효하지 않다.");
			if(!cnt)
				System.out.println("이유 : 암호의 길이가 10보다 작다.");
			if(!num)
				System.out.println("이유 : 암호내 숫자의 개수가 4개 미만이다.");
			if(!en)
				System.out.println("이유 : 암호내 영문자가 없다.");
		}
		
		scan.close();
	}

}

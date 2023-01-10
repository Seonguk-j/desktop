/*
 * 주어진 문장 내에 있는 글자들의 수를 출력하는 프로그램 설계
 * . , ?, ,,! 같은 구두점은 없다 가정
 * 문장내 빈칸, 빈줄, 탭은 포함 X
 */
package java1208;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		int cnt, length;
		String str;
		
		System.out.print("한 줄의 문장을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		
		str = scan.nextLine();
		length = str.length();
		cnt = length;
		
		for(int i = 0; i < length; i++) {
			char temp = str.charAt(i);
			if(temp == ' ' || temp == '\t' || temp == '\n') cnt--;
		}
		
		System.out.println("글자의 수 = " + cnt);
		
		scan.close();
	}

}

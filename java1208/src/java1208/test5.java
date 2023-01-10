/*
 * 1. 문자열 읽음
 * 2. a, e, i, o, u 인 경우 각 문자에 따른 수 카운트
 * 3. 그 외의 경우 별도 카운트
 */
package java1208;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		int cntA = 0, cntE = 0, cntI = 0, cntO = 0, cntU = 0, cntOthers = 0;
		String str;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("문장을 입력하세요(영어로) : ");
		str = scan.nextLine();
		str = str.toLowerCase();
				
		for(int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			if(temp != ' ' && temp != '\t' && temp != '\n') {
				if(temp == 'a') cntA++;
				else if(temp == 'e') cntE++;
				else if(temp == 'i') cntI++;
				else if(temp == 'o') cntO++;
				else if(temp == 'u') cntU++;
				else {
					cntOthers++;
				}
			}
		}
		
		System.out.print("a의 수는 " + cntA);
		System.out.print(", e의 수는 " + cntE);
		System.out.print(", i의 수는 " + cntI);
		System.out.print(", o의 수는 " + cntO);
		System.out.print(", u의 수는 " + cntU);
		System.out.print("이고 자음들의 수는 " + cntOthers + "이다.");
		
		scan.close();
	}

}

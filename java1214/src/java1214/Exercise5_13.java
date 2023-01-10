package java1214;

import java.util.Scanner;

public class Exercise5_13 {

	public static void main(String[] args) {
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray();
			
			for(int j = 0; j < question.length; j++) {
				int k = (int)(Math.random() * 10) % question.length;
				char temp = question[j];
				question[j] = question[k];
				question[k] = temp;
			}
			
			System.out.printf("Q%d. %s의 정답을 입력하세요.>", i + 1, new String(question));
			String answer = scan.nextLine();
			
			if(words[i].equals(answer.trim()))
				System.out.printf("맞았습니다.%n%n");
			else
				System.out.printf("틀렸습니다.%n%n");
		}
		
		scan.close();
	}

}

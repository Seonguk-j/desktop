/*
 * 박 터뜨리기
 * 1. 공의 갯수 N, 팀의 갯수 K 입력받음.
 * 2-1. K가 2인 경우
 * 2-2. (K/2 + 1) * K == N 인 경우.
 * 2-3. (K/2 + 1) * K > N 인 경우.
 * 2-4. 그 외인 경우.
 *   
 */
import java.util.Scanner;

public class Problem_19939 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		
		int minNum = 0;
		for(int i = 1; i <= K; i++) {
			minNum += i;
		}
		
		if(K == 2) {
			if(N > 2) {
				if(N % 2 == 0)
					System.out.println(2);
				else
					System.out.println(1);
			}
			else
				System.out.println(-1);
		}
		else {
			if(N >= minNum) {
				if(N % 2 != 0) {
					if(N % K == 0)
						System.out.println(K / 2 * 2);
					else
						System.out.println(K / 2 * 2 + 1);
				}
				else {
					if(N % K == K / 2)
						System.out.println(K / 2 * 2);
					else
						System.out.println(K / 2 * 2 + 1);
				}
			}
			else
				System.out.println(-1);
		}
		scan.close();
	}

}

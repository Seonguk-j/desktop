import java.util.Scanner;

public class Problem_01065 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int cnt = 0;
		if(n >= 100) {
			for(int i = 100; i <= n; i++) {
				if(check(i))
					cnt++;
			}
			System.out.println(99 + cnt);
		}
		else
			System.out.println(n);
		
		scan.close();
	}
	
	static boolean check(int num) {
		String str = Integer.toString(num);
		char[] arr = str.toCharArray();
		int[] gap = new int[arr.length - 1];
		for(int i = 0; i < arr.length - 1; i++) {
			gap[i] = arr[i] - arr[i + 1];
			if(i > 0) {
				if(gap[i - 1] != gap[i])
					return false;
			}
		}
		return true;
	}

}

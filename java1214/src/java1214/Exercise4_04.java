package java1214;

public class Exercise4_04 {
	
	static int findNum() {
		int num = 1;
		int sum = 0;
		while(true) {
			sum += num;
			if(sum >= 100) break;
			num = Math.abs(num);
			num++;
			if(num % 2 == 0) num = -num;
		}
		return num;
	}
	
	public static void main(String[] args) {
		System.out.println(findNum());
	}
	
}

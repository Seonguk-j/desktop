package java1214;

public class Exercise4_03 {

	static int sum(int num) {
		int sum = 0;
		if(num > 0) {
			for(int i = 1; i <= num; i++) {
				sum += num;
			}
			sum = sum + sum(num - 1);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int num = 10;
		System.out.println(sum(num));
	}

}

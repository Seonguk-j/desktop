package java1214;

public class Exercise4_11 {
	
	static void Fibonnaci(int num1, int num2, int num3, int cnt) {
		num3 = num1 + num2;
		System.out.print(", " + num3);
		if(cnt > 0) {
			Fibonnaci(num2, num3, 0, cnt - 1);
		}
	}

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		System.out.print(num1 + ", " + num2);
		
		for(int i = 0; i < 8; i++) {
			num3 = num1 + num2;
			System.out.print(", " + num3);
			num1 = num2;
			num2 = num3;
		}
		
		//Fibonnaci(num1, num2, num3, 7);
	}

}

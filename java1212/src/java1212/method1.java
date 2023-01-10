package java1212;

public class method1 {

	static int minimum(int num1, int num2) {
		int min;
		min = num1 < num2 ? num1 : num2;
		return min;
	}
	
	public static void main(String[] args) {
		int min1 = minimum(8, 6);
		System.out.println(min1);
	}

}

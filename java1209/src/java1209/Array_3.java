package java1209;

import java.util.Arrays;

public class Array_3 {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6};
		int[] b = new int[7];
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
//		System.arraycopy(a, 2, b, 3, 4);
//		System.out.println(Arrays.toString(b));
		
		//a배열의 4, 5 값을 b 복사 해서
		//b의 출력을 [0, 4, 5, 0, 0, 0, 0]
		//b의 출력을 [0, 4, 5, 1, 2, 3, 0]
	
		System.arraycopy(a, 3, b, 1, 2);
		System.out.println(Arrays.toString(b));
		System.arraycopy(a, 0, b, 3, 3);
		System.out.println(Arrays.toString(b));
	}

}

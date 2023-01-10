package java1213;

import java.util.Random;

public class Exercise20 {

	static int[] shuffle(int[] arr) {
		int[] result = new int[9];
		boolean[] check = new boolean[9];
		Random random = new Random();
		
		for(int i = 0; i < 9; i++) {
			int position = random.nextInt(9);
			if(!check[position]) {
				result[i] = arr[position];
				check[position] = true;
			}
			else {
				i--;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}

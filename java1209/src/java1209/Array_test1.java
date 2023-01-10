package java1209;

public class Array_test1 {

	public static void main(String[] args) {
		int[] arr = {1, 5, 3, 8, 2};
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}

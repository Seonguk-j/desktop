package java1209;

public class Array_test4 {

	public static void main(String[] args) {
		int[][] arr = new int[10][10];
		for(int i = 1; i < arr.length; i++) {
			for(int j = 1; j < arr[i].length; j++) {
				arr[i][j] = i * j;
				System.out.println(i + "X" + j + "=" + arr[i][j]);
			}
			System.out.println();
		}
	}

}

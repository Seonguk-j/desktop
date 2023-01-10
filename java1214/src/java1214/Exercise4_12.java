package java1214;

public class Exercise4_12 {

	public static void main(String[] args) {
		int l = 2;
		for(int k = 0; k < 3; k++) {
			for(int i = 1; i < 4; i++) {
				for(int j = l; j < l + 3; j++) {
					if(j < 10) {
						System.out.print(j + "*" + i + "=" + j * i + "\t");
					}
				}
				System.out.println();
			}
			l += 3;
			System.out.println();
		}
	}

}

import java.util.Scanner;

public class quiz_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] arr = new String[6][6];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(i == 0 && j != 0)
					arr[i][j] = Integer.toString(j - 1);
				else if(i != 0 && j == 0)
					arr[i][j] = Integer.toString(i - 1);
				else {
					arr[i][j] = " ";

				}
			}
		}
		arr[0][0] = " ";
		
		while(true) {
			System.out.print("행 인덱스 입력 : ");
			int row = scan.nextInt();
			if(row == 99) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.print("열 인덱스 입력 : ");
			int col = scan.nextInt();
			
			arr[row + 1][col + 1] = "X";
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
		
		scan.close();
	}

}

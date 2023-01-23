
public class Problem_04673 {

	static boolean[] check = new boolean[10001];
	
	public static void main(String[] args) {
		for(int i = 1; i <= 10000; i++) {
			check(i);
			if(!check[i])
				System.out.println(i);
		}
	}
	
	static void check(int num) {
		int temp = num;
		while(num > 0) {
			temp += num % 10;
			num /= 10;
		}
		if(temp <= 10000)
			check[temp] = true;
	}

}

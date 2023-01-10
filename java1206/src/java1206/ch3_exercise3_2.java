package java1206;

public class ch3_exercise3_2 {

	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket;
		if(numOfApples % sizeOfBucket == 0) {
			numOfBucket = numOfApples / sizeOfBucket;
		}
		else {
			numOfBucket = numOfApples / sizeOfBucket + 1;
		}
		System.out.println("필요한 바구니의 수 : " + numOfBucket);
	}

}

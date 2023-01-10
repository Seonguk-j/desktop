
public class ComputerExample {

	public static void main(String[] args) {
		computer myCom = new computer();
		
		int result1 = myCom.sum(1,2,3);					//매개변수 3개
		System.out.println("result1 = " + result1);
		
		int result2 = myCom.sum(1,2,3,4,5);				//매개변수 5개
		System.out.println("result2 = " + result2);
		
		int[] arr = {1,2,3,4,5};						//매개변수 : 배열형태로 입력
		int result3 = myCom.sum(arr);
		System.out.println("result3 = " + result3);
		
		int result4 = myCom.sum(new int[] {1,2,3,4,5});	//매개변수 : new 배열로 선언해서 입력
		System.out.println("result4 = " + result4);
	}

}

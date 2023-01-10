
public class ArrayReferenceObjetExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] == strArray[1]);			//참조 주소 값이 같다.
		System.out.println(strArray[0] == strArray[2]);			//참조 주소 값이 다르다.
		System.out.println(strArray[0].equals(strArray[1]));	//내용이 같다.
	}

}

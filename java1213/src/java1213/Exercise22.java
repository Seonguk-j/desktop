package java1213;

public class Exercise22 {

	static boolean isNumber(String str) {
		boolean check = true;
		
		//str.equals("") || str == null 로 표기를 하면  nullPointException이 발생하게 됨.
		if("".equals(str) || str == null) check = false;
		else {
			char[] arr = str.toCharArray();
					
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] < 48 || arr[i] > 57) {
					check = false;
					break;
				}
			}
		}
		return check;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}

}

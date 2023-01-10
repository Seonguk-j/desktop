package java1213;

class Cellphone {
	String model = "gallaxy 22";
	String color;
	int capacity;
	
	Cellphone(){
		this.color = "black";
		this.capacity = 32;
	}
	
//	Cellphone(String color, int capacity){
//		this.color = color;
//		this.capacity = capacity;
//	}
}

public class Constructor1 {

	public static void main(String[] args) {
		//Cellphone myphone = new Cellphone();	//에러 발생 : 매개변수를 이용한 생성자를 생성시에는 기본 생성자 무시
		Cellphone myphone = new Cellphone();	//생성자 매개변수 동일 생성자 호출 
		
		System.out.println(myphone.model);
		System.out.println(myphone.color);
		System.out.println(myphone.capacity);
	}

}

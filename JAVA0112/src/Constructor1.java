
class Cellphone {
	String model = "Galaxy 8";
	String color;
	int capacity;
	
	Cellphone(String color, int capacity){
		this.color = color;
		this.capacity = capacity;
	}
	
}

public class Constructor1 {

	public static void main(String[] args) {
//		Cellphone myPhone1 = new Cellphone();
		Cellphone myPhone = new Cellphone("silver", 128);
		
		System.out.println(myPhone.model);
		System.out.println(myPhone.color);
		System.out.println(myPhone.capacity);
	}

}

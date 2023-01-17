
class Student1 {
	void learn() {
		System.out.println("배우기");
	}
	void eat() {
		System.out.println("밥먹기");
	}
	void say() {
		System.out.println("선생님 안녕하세요!");
	}
}

class Leader extends Student1 {
	void lead() {
	}
	
	void say() {
		System.out.println("선생님께 인사");
		super.say();
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		Leader leader1 = new Leader();

		leader1.say();
	}
	String str;

}

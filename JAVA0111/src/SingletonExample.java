
public class SingletonExample {

	public static void main(String[] args) {
		
//		Singleton obj1 = new Singleton(); //private 설정으로 인해서 Singleton 생성자에 접근 불가
//		Singleton obj1 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		}
		else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
	}

}

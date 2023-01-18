class AgeException extends Exception {
	public AgeException() {}
	public AgeException(String message) {
		super(message);
	}
}

public class Exception4 {
	
	public static void ticketing(int age) throws AgeException {
		if(age < 0)
			throw new AgeException("나이 입력이 잘못 되었습니다.");
		else if(age < 20)
			throw new AgeException("성인만 입장이 가능합니다.");
		else
			System.out.println("즐거운 관람되세요.");
	}

	public static void main(String[] args) {
		
		int age = 19;
		try {
			ticketing(age);
		} catch(AgeException e) {
			e.printStackTrace();
		}
		
	}

}




public class Car {
	//필드 선언
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		else {
			System.out.println("gas가 있습니다.");
			return true;
		}
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas 잔량 : " + gas + ")");
				gas--;
			}
			else {
				System.out.println("멈춥니다.(gas 잔량 : " + gas + ")");
				return;		//지금 현재 동작하는 run() 메소드를 종료
			}
		}
	}
}

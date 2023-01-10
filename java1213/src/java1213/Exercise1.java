package java1213;

public class Exercise1 {

	public static void main(String[] args) {
		SutadaCard card1= new SutadaCard(3, false);
		SutadaCard card2= new SutadaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}

class SutadaCard {
	int num = 1;
	boolean isKwang = true;
	
	SutadaCard(){
		
	}
	SutadaCard(int num, boolean check){
		this.num = num;
		this.isKwang = check;
	}
	
	String info(){
		String str;
		str = Integer.toString(num);
		if(isKwang) {
			str += "K";
		}
		return str; 
	}
}
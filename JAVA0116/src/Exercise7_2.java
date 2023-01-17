class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i = 0; i < CARD_NUM; i++) {
			if(i < 10) {
				if((i + 1) == 1 || (i + 1) == 3 || (i + 1) == 8) {
					cards[i] = new SutdaCard(i + 1, true);
				}
				else {
					cards[i] = new SutdaCard(i + 1, false);
				}
			}
			else {
				cards[i] = new SutdaCard(i % 10 + 1, false);
			}
		}
	}
	
	void shuffle() {
		for(int i = 0; i < CARD_NUM; i++) {
			int num = (int)(Math.random() * 20);
			SutdaCard temp = cards[i];
			cards[i] = cards[num];
			cards[num] = temp;
		}
	}
	
	SutdaCard pick(int index){
		return cards[index];
	}
	
	SutdaCard pick(){
		return cards[(int)(Math.random() * 20)];
	}
	
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Exercise7_2 {

	public static void main(String[] args) {

		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ", ");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));
	}

}

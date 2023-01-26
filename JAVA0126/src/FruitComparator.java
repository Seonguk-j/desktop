import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {
	//가격 price를 기준으로 정렬
	@Override
	public int compare(Fruit o1, Fruit o2) {
		if(o1.price < o2.price) return -1;		//o1이 작다면 -1
		else if(o1.price == o2.price) return 0;	//o1과 o2가 같다면 0
		else return 1;							//o1이 크다면 1
	}
}

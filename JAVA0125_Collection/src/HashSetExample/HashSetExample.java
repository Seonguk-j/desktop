package HashSetExample;
import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		//hashSet 컬렉션 생성
		Set<String> set = new HashSet<String>();
		
		//객체 저장
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java");		//중복되는 객체는 저장이 되지 않는다.
		set.add("Spring");
		
		//저장된 객체 수 출력
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
	}

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//현재 자바 버전이 낮아 사용 불가

public class ImmutableExample {

	public static void main(String[] args) {
		List<String> immutableList1 = List.of("A", "B" , "C");
//		immutableList1.add("D");		//수정할 수 없는 컬렉션에는 데이터를 추가할 수 없다.
		
		Set<String> immutableSet1 = Set.of("A", "B", "C");
//		immutableList1.remove("D");		//수정할 수 없는 컬렉션에는 데이터를 삭제할 수 없다.
		
		Map<Integer, String> immutableMap1 = Map.of(1, "A", 2, "B", 3, "C");
//		immutableList1.put(4, "D");		//수정할 수 없는 Map에는 데이터를 추가할 수 없다.
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		List<String> immutableList2 = List.copyOf(list);	//LIST를 불변 컬렉션 LIST 변경
		
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String> immutableSet2 = Set.copyOf(set);		//Set을 불변 컬렉슨 Set으로 변경
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		Map<Integer, String> immutableMap2 = Map.copyOf(map);
		
		String[] arr = {"A", "B", "C"};
		List<String> immutableList3 = Arrays.asList(arr);	//배열을 불변 컬렉션 List으로 변경
	}

}

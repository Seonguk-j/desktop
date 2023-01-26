package exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			maxScore = Math.max(maxScore, v);
			totalScore += v;
			if(v == maxScore) {
				name = k; 
			}
		}
		System.out.println("평균 점수 : " + (totalScore/map.size()));
		System.out.println("최고 점수 : " + maxScore);
		System.out.println("최고 점수를 받은 아이디 : " + name);
		
	}

}

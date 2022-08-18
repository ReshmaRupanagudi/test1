package basic;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbcdeffsdsd";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			Integer count = map.get(c);
			if (map.containsKey(c))
				map.put(c, count + 1);
			else {
				map.put(c, 1);
			}
		}
 
		System.out.println(map);
		Map<Character, Long> mp = str.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(mp);
		
	}

}

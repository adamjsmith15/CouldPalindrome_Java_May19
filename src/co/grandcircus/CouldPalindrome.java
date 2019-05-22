package co.grandcircus;
import java.util.HashMap;
import java.util.Map;

public class CouldPalindrome {
	public static boolean couldFormPalindrome(String string) {
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < string.length(); i++) {
			if(map.containsKey(string.charAt(i))) {
				int tempNum = map.get(string.charAt(i));
				map.put(string.charAt(i), tempNum + 1);
			}else {
				map.put(string.charAt(i), 1);
			}
		}
		int counter = 0;
		for(int i = 0; i < string.length(); i++) {
			if(map.get(string.charAt(i)) %2 != 0) {
				counter++;
			}
		}
		if(string.length() % 2 == 0 && counter == 0 || (string.length() % 2 == 1 && counter == 1)) {
			return true;
		}else {
			return false;
		}
	}
}

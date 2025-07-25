/*
1. Count Character Frequency
Problem: Count how many times each character appears in a string.
Sample Output for "banana"
Character: a, Frequency: 3  
Character: b, Frequency: 1  
Character: n, Frequency: 2

 */

package Map_Programs;
import java.util.*;
public class CountFrequency {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String str=s.nextLine();
		Map<Character, Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		for(char key :map.keySet()) {
			System.out.println("key: "+key+"    Frequency:     "+map.get(key));
		}
	}

}

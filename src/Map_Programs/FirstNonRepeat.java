/*
3. First Non-Repeating Character
Problem: Find the first character that doesn't repeat in a string.
Example:
Input: "swiss"
 Output: 'w'
 Explanation:
 's' appears 3 times, 'w' appears once, 'i' appears once — but 'w' comes before 'i'.
 */

package Map_Programs;
import java.util.*;
public class FirstNonRepeat {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter STring ");
		String str=s.nextLine();
		Map<Character, Integer> map=new LinkedHashMap<>();
		
		for(char ch:str.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println("First Non Repeat Character is: "+entry.getKey());
				return;
			}
			
		}

	}

}

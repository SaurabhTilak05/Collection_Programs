package Map_Programs;
import java.util.*;
public class Hashmap {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		
		map.put(1,"A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4,"D");
		map.put(5, "E");
		
		Set<Map.Entry> es=map.entrySet();
		for(Map.Entry e :es)
		{
			System.out.println(e.getKey()+"\t"+e.getValue());
		}

	}

}

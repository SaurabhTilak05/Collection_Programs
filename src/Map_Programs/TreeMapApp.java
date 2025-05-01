package Map_Programs;
import java.util.*;
public class TreeMapApp {

	public static void main(String[] args) {
		TreeMap map=new TreeMap();
		map.put(1, "ABC");
		map.put(2, "MNO");
		map.put(3, "PQR");
		map.put(4, "RST");
		
		
		Set<Map.Entry> es=map.entrySet();
		for(Map.Entry e:es)
		{
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
				

	}

}

/*we want to create a program to perform the following operation on map.
Case 1: store data in map
Case 2: View all data from map
Case 3: search data from map by using key
Case 4: delete data from map using key 
Case 5: count total number of elements of map
Case 6: display only keys of map
*/
package Map_Programs;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;

public class OperationOnMap {
	public static void main(String[] args) {
		LinkedHashMap map = new LinkedHashMap();
		Scanner s=new Scanner(System.in);
		do {
			System.out.println("1:Add New Data in map");
			System.out.println("2:View All Data from map");
			System.out.println("3:Search data from map using key");
			System.out.println("4:Delete data from map using key");
			System.out.println("5:Count total number of element ");
			System.out.println("6:Display all keys");
			System.out.println("7: For Exit");
			System.out.println("Eneter Your Choice");
			int ch=s.nextInt();
			s.nextLine();
			switch(ch)
			{
			case 1:
				System.out.print("Eneter Student name in map");
				String name=s.nextLine();
				System.out.print("Enter student id in map");
				int id=s.nextInt();
				map.put(id,name);
				break;
				
			case 2:
				Set<Map.Entry> es=map.entrySet();
				for(Map.Entry e : es)
				{
					System.out.println(e.getKey()+" "+e.getValue());
				}
				break;
			case 3:
				System.out.print("Enter Key to Search Data in Map");
				int key=s.nextInt();
				boolean b=map.containsKey(key);
				if(b)
				{
					System.out.println("Data search succesfully....!!");
				}
				else {
					System.out.println("Data Not present");
				}
				break;
				
			case 4:
				System.out.println("Enter Kay For delete Data in map");
				key=s.nextInt();
				b=map.containsKey(key);
				if(b)
				{
					map.remove(key);
					System.out.println("Data Delete SuccessFull.....!!");
				}
				else {
					System.out.println("Data Is Not present");
				}
				break;
				
			case 5:
				System.out.println(" total number of element is:"+map.size());
				break;
				
			case 6:
				Set keys=map.keySet();
				for(Object k:keys)
				{
					System.out.println(k);
				}
				break;
			case 7:
				System.exit(0);
				break;
				
				
				
			}
			
			
			
		}while(true);
		
	}

}

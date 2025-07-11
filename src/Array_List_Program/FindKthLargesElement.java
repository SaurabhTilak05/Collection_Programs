package Array_List_Program;
import java.util.*;
public class FindKthLargesElement {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Data");
	List<Integer> list=new ArrayList<>();

		for(int i=0;i<4;i++) 
		{
			list.add(s.nextInt());
		}
		System.out.println("Enter k ");
		int k=s.nextInt();
		
		
		Collections.sort(list, Collections.reverseOrder());
		if(k<=0 ||k>list.size()) {
			System.out.println("Invalid");
		}
		else {
			System.out.println(list.get(k-1));
		}

	}

}


//find the max in this arrayList


package Array_List_Program;
import java.util.*;

public class RemoveDuplicat {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList al=new ArrayList();
		System.out.println("Enter Data in array List");
		for(int i=0;i<5;i++) {
			al.add(s.nextInt());
		}
		Iterator itr=al.iterator();
		System.out.print("Display Array list Elements:  ");
		while(itr.hasNext()) {
			Object obj=itr.next();
			System.out.print(obj+" ");
		}
		int max = (int) al.get(0);
		for(int i=0;i<al.size();i++) {
			int val=(int) al.get(i);
			if(val>max)
			{
				max=val;
			}
		}
		
		System.out.println("");
		System.out.println("Max Value is:   "+max);
	}
}

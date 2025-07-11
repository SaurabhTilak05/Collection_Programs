//Find First Non-Repeating Element
//Given an ArrayList<String>, find the first non-repeating element.
//Example: ["apple", "banana", "apple", "mango", "banana"] → mango
package Array_List_Program;
import java.util.*;
public class FindNonRepatingElm {

	public static String firstNonRepeat(ArrayList<String> str)
	{
		for(int i=0;i<str.size();i++)
		{
			boolean nonRept=true;
			for(int j=0;j<str.size();j++)
			{
				if (i!=j && str.get(i).equals(str.get(j))) {
					nonRept= false;
					break;
				}
			}
			if(nonRept) {
				return str.get(i);
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ArrayList Strings");
		  ArrayList<String> list = new ArrayList<>();
		  for(int i=0;i<6;i++)
		  {
			  list.add(s.nextLine());
		  }
		
		String result=firstNonRepeat(list);
		if(result!=null)
		{
			System.out.println("First Non Repeated String is:  "+result);
		}
		else {
			System.out.println("Not Found");
		}
		
	}

}

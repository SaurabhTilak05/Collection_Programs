// First Repeating String 

package Array_List_Program;
import java.util.*;
public class FirstRepeatString {
	
	public static String FirstRepeatString(ArrayList<String>str)
	{
		for(int i=0;i<str.size();i++)
		{
			boolean repeat=true;
			for(int j=i+1;j<str.size();j++)
			{
			    if (str.get(i).equals(str.get(j))) {
					return str.get(i);
					
				}
			}
			
		}
		return null;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String in ArrayList ");
		ArrayList<String> al = new ArrayList<>();

		for(int i=0;i<6;i++)
		{
			al.add(s.nextLine());
		}
		String result=FirstRepeatString(al);
		if(result!=null)
		{
			System.out.println("First repeat is:  "+result);
		}
		else {
			System.out.println("String not repeat");
		}
		
		

	}

}

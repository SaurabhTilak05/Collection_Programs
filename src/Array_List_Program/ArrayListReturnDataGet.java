package Array_List_Program;
import java.util.*;
public class ArrayListReturnDataGet {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter data in array list");
		ArrayList al=new ArrayList();
		for(int i=0;i<6;i++)
		{
			al.add(s.nextInt());
		}
		System.out.println("Display data using get method");
		for(int i=0;i<al.size();i++)
		{
			Object obj=al.get(i);
			System.out.println(obj);
		}
		
	}

}

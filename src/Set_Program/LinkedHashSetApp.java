package Set_Program;
import java.util.*;
public class LinkedHashSetApp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		LinkedHashSet set=new LinkedHashSet();
		for(int i=0;i<10;i++)
		{
			set.add(s.nextInt());
		}
		System.out.println("Display Data");
		for(Object obj :set)
		{
			System.out.println(obj);
		}
	}

}

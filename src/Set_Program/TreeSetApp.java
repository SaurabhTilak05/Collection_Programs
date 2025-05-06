package Set_Program;
import java.util.*;
public class TreeSetApp {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		TreeSet set=new TreeSet();
		System.out.println("Enter data in TreeSet ");
		for(int i=0;i<10;i++)
		{
			set.add(s.nextInt());
		}
		System.out.println("Display Data in TreeSet");
		for(Object obj:set)
		{
			System.out.println(obj);
		}
	}

}

package Set_Program;
import java.util.*;
public class HashSetApp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter HashSet Values");
		HashSet set=new HashSet();
		for(int i=1;i<11;i++)
		{
			set.add(s.nextInt());
		}
		System.out.println("Display hashSet values");
		for(Object obj : set) {
			System.out.print(obj+" ");
		}
	}

}

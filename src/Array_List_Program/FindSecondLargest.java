package Array_List_Program;
import java.util.*;
public class FindSecondLargest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 System.out.println("Enter Data ");
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<6;i++)
		{
			list.add(s.nextInt());
		}
		int sec=0;
		int max=0;
		for(int num:list) {
			if(num>max)
			{
				sec=max;
				max=num;
			}
			else if(num>sec && num!=max) {
				sec=num;
			}
		}
		System.out.println(sec);
	}

}

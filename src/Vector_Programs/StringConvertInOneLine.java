package Vector_Programs;

import java.util.*;
public class StringConvertInOneLine {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Vector v=new Vector();
		System.out.println("Enter Strings in Vector");
		
		for(int i=0;i<3;i++)
		{
			v.add(s.nextLine());
		}
		String srt="";
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			srt=srt+" "+ (String)obj;
		}
		System.out.println(srt);
		}
}

package Vector_Programs;

import java.util.*;

public class FindMaxInVector {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Values In Vector");
		Vector v=new Vector();
		for(int i=0;i<6;i++)
		{
			v.add(s.nextInt());
		}
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println(obj);
		}
		
		
		Object max=v.get(0);
		for(int i=0;i<v.size();i++)
		{
			if((int)v.get(i)>(int) max)
			{
				max=(int)v.get(i);
			}
		}
		System.out.println("Max Is:"+max);
	}
}

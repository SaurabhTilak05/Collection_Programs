package Vector_Programs;

import java.util.*;


public class SortVectorApp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Vector v=new Vector();
		System.out.println("Enter Values In Array");
		for(int i=0;i<=5;i++)
		{
			v.add(s.nextInt());
		}
		for(int i=0;i<v.size();i++)
		{
			for(int j=i+1;j<v.size();j++)
			{
				Object prev=v.get(i);
				Object next=v.get(j);
				if((int)prev>(int)next)
				{
					v.set(i, next);
					v.set(j, prev);
				}
			}
		}
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println(obj);
		}
	}
}

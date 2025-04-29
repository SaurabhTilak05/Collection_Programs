package Vector_Programs;

import java.util.*;
public class ReverseVectorUsingListIterator {
	 public static void main(String[] args)
	    {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Values In Vectors");
		Vector v=new Vector();
		for(int i=0;i<5;i++)
		{
			v.add(s.nextInt());
		}
		ListIterator ltr=v.listIterator(v.size());
		while(ltr.hasPrevious())
		{
			Object previous=ltr.previous();
			System.out.println(previous);
		}
	}
}

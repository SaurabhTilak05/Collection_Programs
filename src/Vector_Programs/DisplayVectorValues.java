/*
 * WAP to create Vector class and store 5 values in it and display vector data using a following methods 
	Show the vector data using Enumeration 
	Show the vector data using Iterator 
	Show the vector data using normal for loop
	Show the vector data using foreach 
	Show the vector data using ListIterator 
 */

package Vector_Programs;

import java.util.*;
public class DisplayVectorValues {

	public static void main(String[] args) {
		Vector v=new Vector();
		Scanner s=new Scanner(System.in);
		System.out.println("Add Values in vector");
		for(int i=0;i<5;i++)
		{
			v.add(s.nextInt());
		}
		System.out.println("Show the vector data using Enumeration");
		Enumeration enm = v.elements();
		while(enm.hasMoreElements())
		{
			Object elm=enm.nextElement();
			System.out.println(elm);
		}
		System.out.println("Show the vector data using Iterator");
		Iterator itr=v.iterator();
		
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println(obj);
		}
		
		System.out.println("Show the vector data using normal for loop");
		for(int i=0;i<v.size();i++)
		{
			Object obj=v.get(i);
			System.out.println(obj);
		}
		
		System.out.println("Show the vector data using foreach");
	
		for(Object obj: v) {
			System.out.println(obj);
		}
		
		System.out.println("Show the vector data using ListIterator");
		ListIterator lrt=v.listIterator();
		while(lrt.hasNext())
		{
			Object obj=lrt.next();
			System.out.println(obj);
		}
	}
}

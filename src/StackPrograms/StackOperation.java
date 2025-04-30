/*
 * WAP to create a stack and perform the following operation on it.
	Case1: push data in stack 
	Case 2: pop data from stack
	Case 3: display all data from stack

 */
package StackPrograms;
import java.util.*;
public class StackOperation {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			Stack st=new Stack();
			
			int ch;
			do {
				System.out.println("1: push data in stack");
				System.out.println("1: pop data from stack");
				System.out.println("3: display all data from stack");
				System.out.println("4 :for Exist Program");
				ch=s.nextInt();
				switch(ch) 
				{
				case 1:
					 System.out.println("Enter data in stack");
					 int val=s.nextInt();
					 st.push(val);
					break;
					
				case 2:
					boolean b=st.isEmpty();
					if(b)
					{
						System.out.println("Stack is Empty");
					}
					else {
						System.out.println("pop data is "+st.pop());
					}
					break;
					
				case 3:
					ListIterator li=st.listIterator(st.size());
					while(li.hasPrevious())
					{
						Object obj=li.previous();
						System.out.println(obj);
					}
					break;
					
				case 4:
					
					break;
				}
				
			}while(ch!=4);
			

	}

}

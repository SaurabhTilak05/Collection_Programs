/*
 * . WAP to create LinkedList and perform the following operation on it.
	Case 1: add Node at first 
	Case 2: add Node at last 
	Case 3: remove node from first 
	Case 4: remove node from last 
	Case 5: view all data from linked list

 */

package LinkedList_Programs;
import java.util.*;
public class LinkedListOperations {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		LinkedList<Integer> ls=new LinkedList<>();
		
		int ch;
		do {
			System.out.println("1 .add Node at first ");
			System.out.println("2 .add Node at last ");
			System.out.println("3 .remove node from first ");
			System.out.println("4 .remove node from last ");
			System.out.println("5 .view all data from linked list ");
			ch=s.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter value to add first node");
				int val=s.nextInt();
				ls.addFirst(val);
				break;
				
			case 2:
				System.out.println("Enter value to add last node");
				 val=s.nextInt();
				ls.addLast(val);
				break;
				
			case 3:
				if(ls.isEmpty())
				{
					System.out.println("LinkedList is empty cann't remove node ");
				}
				else {
					int removefirst=ls.removeFirst();
					System.out.println("remove data frim first"+removefirst);
				}
				break;
				
			case 4:
				if(ls.isEmpty())
				{
					System.out.println("LinkedList is empty cann't remove node ");
				}
				else {
					int removelast=ls.removeLast();
					System.out.println("remove data frim first"+removelast);
				}
				break;
			case 5:
				System.out.println("----- LinkedList data is ------");
				for(int data :ls)
				{
					System.out.println(data);
				}
				break;
				
				
			}
		}while(ch!=6);
		
	}

}

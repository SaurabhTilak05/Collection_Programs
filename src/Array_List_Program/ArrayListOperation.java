/*
 * WAP to create ArrayList and perform following operation on it 
	Case 1: add new data in ArrayList
	Case 2: view all data from ArrayList
	Case 3: Search Data using contains method 
	Case 4: Search data using indexOf() method 
	Case 5: delete data using index
	Case 6: count total number of element from ArrayList
	Case 7: check ArrayList  is empty or not 

 */

package Array_List_Program;
import java.util.*;
public class ArrayListOperation {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList al=new ArrayList();
		int ch;
		do {
			System.out.println("\n\rCase 1: add new data in ArrayList\r\n"
					+ "	Case 2: view all data from ArrayList\r\n"
					+ "	Case 3: Search Data using contains method \r\n"
					+ "	Case 4: Search data using indexOf() method \r\n"
					+ "	Case 5: delete data using index\r\n"
					+ "	Case 6: count total number of element from ArrayList\r\n"
					+ "	Case 7: check ArrayList  is empty or not ");
			System.out.println("Enter 8 To Exit ");
			ch=s.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Add Data in ArrayList");
				for(int i=0;i<5;i++)
				{
					al.add(s.nextInt());
				}
				break;
				
			case 2:
				System.out.println("View All Data ");
				for(int i=0;i<al.size();i++)
				{
					Object obj=al.get(i);
					System.out.println(obj);
				}
				break;
				
			case 3:
				System.out.println("Enter Value to search ");
				int val=s.nextInt();
				boolean b=al.contains(val);
				if(b)
				{
					System.out.println("Element Found");
				}
				else {
					System.out.println("Element not found");
				}
				break;
				
			case 4:
				System.out.println("Enter Value to search");
				val=s.nextInt();
				int index=al.indexOf(val);
				if(index!=-1)
				{
					System.out.println("Element Found");
				}
				else {
					System.out.println("Element Not Found");
				}
				break;
				
			case 5:
				System.out.println("Enter Value to search");
				val=s.nextInt();
				 index=al.indexOf(val);
				if(index!=-1)
				{
					Object obj=al.remove(index);
					System.out.println("Element Delete Succesfully....!!");
				}
				else {
					System.out.println("Element Not Found");
				}
				break;
				
			case 6:
				System.out.println("total number of element in ArrayList is: "+al.size());
				break;
				
			case 7:
				b=al.isEmpty();
				if(b)
				{
					System.out.println("ArrayList is Empty");
				}
				else {
					System.out.println("Array List Is not Empty");
				}
				break;
				
			case 8:
				break;
			default :
				System.out.println("You enter Wrong Choice");
				
				break;
			}
		}while(ch!=8);
		
	}

}

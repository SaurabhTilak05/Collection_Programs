package Vector_Programs;

import java.util.*;
public class OperationOnVector {

	public static void main(String[] args) {
		Vector v= new Vector();
		do {
			Scanner s=new Scanner (System.in);
			System.out.println("1: Add Element");
			System.out.println("2: View All  ");
			System.out.println("3: Count number of element ");
			System.out.println("4:Search element by contains method");
			System.out.println("5:Search Element by index");
			System.out.println("6:Delete by using its index");
			System.out.println("7:Fetch elements by using get method");
			System.out.println("8: SubList");
			System.out.println("9: Remove element by value");
			System.out.println("Enter your choice");
			int choice = s.nextInt();
			switch (choice) 
			{
			case 1:
				System.out.println("Enter Data In Vector");
				int no=s.nextInt();
				boolean b = v.add(no);
				if(b)
				{
					System.out.println("Element Added");
				}
				else {
					System.out.println("Element Not Added");
				}
			break;
				
			case 2:
				Iterator i=v.iterator();
				while(i.hasNext())
				{
					Object obj= i.next();
					System.out.println(obj);
				}
				break;
				
			case 3:
				System.out.println("Number Of Elemens in Vectors:\t"+v.size());
				break;
				
				
			case 4:
				System.out.println("Enter Value to Search Value");
				no=s.nextInt();
				b=v.contains(no);
				if(b)
				{
					System.out.println("Value Found");
				}
				else {
					System.out.println("Value Not Found");
				}	
			break;	
			
			case 5:
			System.out.println("Enter Index to Search value");
			no =s.nextInt();
			int index= v.indexOf(no);
			if(index != -1)
			{
				System.out.println("Data Found:\t"+index);
			}
			else {
				System.out.println("Data Not Found");
			}
			break;
			
			case 6:
				System.out.println("Enter Index to delete value");
				int deleteindex=s.nextInt();
				if(deleteindex >= 0  && deleteindex < v.size())
				{
					Object obj=v.remove(deleteindex);
					System.out.println("Data deleted:\t"+obj);
				}
				else {
					System.out.println("Data Not Deleted");
				}
				break;
				
			case 7:
				for(int k=0;k<v.size();k++)
				{
					Object obj=v.get(k);
					System.out.println(obj);
				}
				break;
			
			case 8:
				System.out.println("Eneter Start Index And End Index");
				int start=s.nextInt();
				int end=s.nextInt();
				if(start >=0 && end < v.size())
				{
					List list= v.subList(start, end);
					for(Object obj:list)
					{
						System.out.print(obj+"\t");
					}
				}
				System.out.println();
				break;
				
			case 9:
				System.out.println("Enter Value For Remove");
				int val=s.nextInt();
				v.remove((Object)val);
				break;
				
				
			case 10:
				System.exit(0);
				break;
				
				default :
					System.out.println("Invalid Choice");
					break;  
			}
		}
		while (true);
	}
}

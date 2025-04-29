package Vector_Programs;

import java.util.*;


public class VectorOperationsInCollection {

	public static void main(String[] args) {
		Vector v= new Vector();
		do {
			Scanner s= new Scanner(System.in);
			System.out.println("1. Add 10 Values In Vector.\r\n"
					+ "2. Display All Values In Vector.\r\n"
					+ "3. Add New Value In Vector.\r\n"
					+ "4. Search Value In Vector.\r\n"
					+ "5. Sort All Values In Ascending Order In Vector.\r\n"
					+ "6. Sort All Values In Descending Order In Vector.\r\n"
					+ "7. Find Max Value In Vector.\r\n"
					+ "8. Find Min Value In Vector.\r\n"
					+ "9. Update Value In Vector.\r\n"
					+ "10. Delete Value In Vector.");
			System.out.println("Enter Your Choice");
			int ch=s.nextInt();
			switch(ch) {
			
			case 1:
				
				System.out.println("Enter elements in Vector");
				for(int i=0;i<5;i++)
				{
					v.add(s.nextInt());
				}
					
				break;
				
			case 2:
				Iterator itr=v.iterator();
				while(itr.hasNext())
				{
					Object obj=itr.next();
					System.out.println(obj);
				}
				break;
				  
			case 3:
				System.out.println("Add Element in vector");
				int a=s.nextInt();
				v.add(a);
				break;
				
			case 4:
				System.out.println("Enter value To search");
				int val=s.nextInt();
				boolean b = v.contains(val);
				if(b)
				{
					System.out.println("Element found");
				}
				else {
					System.out.println("Element not Found");
				}
				break;
				
				
			case 5:
				System.out.println("Sort All Values Accending Order");
				for(int i=0;i<v.size();i++)
				{
					for(int j=0;j<v.size();j++)
					{
						Object prev=v.get(i);
						Object next=v.get(j);
						if((int)prev<(int)next)
						{
							v.set(i, next);
							v.set(j, prev);
						}
					}
				}
				
				break;
				
			case 6:
				System.out.println("Sort All Values Decinding Order");
				for(int i=0;i<v.size();i++)
				{
					for(int j=0;j<v.size();j++)
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
				
				break;
				
			case 7:
				int max=(int)(v.get(0));
				for(int i=0;i<v.size();i++)
				{
					
						if((int)v.get(i)>max)
						{
							max=(int)v.get(i);
						}
					
				}
				System.out.println(max);
				
				break;
				
			case 8:
				int min=(int)(v.get(0));
				for(int i=0;i<v.size();i++)
				{
					
						if((int)v.get(i)<min)
						{
							min=(int)v.get(i);
						}
					
				}
				System.out.println(min);
				break;
				
			case 9:
				System.out.println("Enter Value for change");
				int in=s.nextInt();
				System.out.println("Enter Value");
				int n=s.nextInt();
				int index=v.indexOf(in);
				if(index!=-1)
				{
					v.set(index, n);
					System.out.println("Update Value SuccesFully....!!");
				}
				else {
					System.out.println("Value Is Not Present");
				}
				break;
				
			case 10:
				System.out.println("Enter Value to Delete");
				val=s.nextInt();
				 index=v.indexOf(val);
				if(index!=-1)
				{
					Object obj=v.remove(index);
					System.out.println("Delete Value SuccesFully....!!");
				}
				else {
					System.out.println("Data Are Not Present");
				}
				break;
				
			case 11:
				System.exit(0);
				break;
			}	
		}
		while(true);
	}
}

package Vector_Programs;
import java.util.*;
public class VectorApp {

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 Vector v=new Vector();
	 int ch;
	 do {
		 System.out.println("1: Add New Element in Vector ");
		 System.out.println("2: View All Elements ");
		 System.out.println("3: Count number of element ");
		 System.out.println("4: Search element by contains");
		 System.out.println("5: Search Element by index ");
		 System.out.println("6: delete element by using index ");
		 System.out.println("7: Fetch elements using get() method ");
		 System.out.println("8: SubList");
		 System.out.println("9: Remove by element ");
		 System.out.println(" Enter Your Choice  ");
		 ch=s.nextInt();
		 
		 switch(ch)
		 {
		 case 1:
			 System.out.println("Add Data in vector...");
			 for(int i=1;i<6;i++)
			 {
				 v.add(s.nextInt());
			 }
			System.out.println("Add successfully...!!");
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
			 System.out.println("Numer of elements in vector is  "+v.size());
			 break;
			 
		 case 4:
			 System.out.println("Enter data to search");
			 int val=s.nextInt();
			 boolean b=v.contains(val);
			 if(b) {
				 System.out.println("Data found");
			 }
			 else {
				 System.out.println("data not present");
			 }
			 break;
			 
		 case 5:
			 System.out.println("Enter data to search");
			 val=s.nextInt();
			 int index=v.indexOf(val);
			 if(index!=-1)
			 {
				 System.out.println("Data found");
			 }
			 else {
				 System.out.println("Data not found");
			 }
			 break;
			 case 6: System.out.println("Enter data to search");
			 val=s.nextInt();
			 index=v.indexOf(val);
			 if(index!=-1)
			 {
				Object obj=v.remove(index);
				 System.out.println("Delete Successfully.....!!");
			 }
			 else {
				 System.out.println("Data not found");
			 }
			 break;
			 //7: Fetch elements using get() method 
			 case 7:
				 for(int i=0;i<v.size();i++)
				 {
					 Object obj=v.get(i);
					  System.out.println(obj);
				 }
				 break;
			 case 8:
				 System.out.println("Enter first index and last index");
				 int stind=s.nextInt();
				 int lsind=s.nextInt();
				 List list=v.subList(stind, lsind);
				 for(Object obj:list)
				 {
					 System.out.print(obj+" ");
				 }
				 System.out.println("");
				 break;
				 
				 //Remove by element 
			 case 9:
				 System.out.println("Enter elemennt for remove");
				 int elm=s.nextInt();
				 v.remove((Object)elm);
				 break;
				 
			 case 11:
				 System.exit(0);
				 break;
		 }
		 
		 
	 }while(true);
	 
	
	 
	}

}

package Vector_Programs;
import java.util.*;
public class VectorProgramOperation {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Vector v=new Vector();
		int ch;
		do {
			System.out.println("1: Add Elements In Vector");
			System.out.println("2: View All Data in vector");
			System.out.println("3: Count Number of elements present in vector");
			System.out.println("4: Serch elements by cointain method");
			System.out.println("5: search element by index");
			System.out.println("6: Delete element by index");
			System.out.println("7: Fetch element by get method");
			System.out.println("8: sublist ");
			System.out.println("9: Remove element by value");
			System.out.println("11: For Exit");
			System.out.println("Enter Your choice");
			ch=s.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter Data in Vector");
				for(int i=0;i<5;i++)
				{
					v.add(s.nextInt());
				}
				break;
			case 2:
				Iterator itr= v.iterator();
				while(itr.hasNext())
				{
					Object obj =itr.next();
					System.out.println(obj);
				}
				break;
			case 3:
				System.out.println("Number of elements present in vector is "+v.size());
				break;
			case 4: //Serch elements by cointain method
				
				System.out.println("Enetr value for searching ");
				int val =s.nextInt();
				boolean b =v.contains(val);
				if(b)
				{
					System.out.println("Elemen Found");
				}
				else {
					System.out.println("Element not Present");
				}
				break;
			case 5:// search element by index
				System.out.println("Enetr value for searching ");
				val =s.nextInt();
				int index=v.indexOf(val);
				if(index!=-1)
				{
					System.out.println("Data found");
				}
				else {
					System.out.println("Data Not Found");
				}
				break;
			case 6: //Delete element by index
				System.out.println("Enetr value for searching ");
				val =s.nextInt();
				 index=v.indexOf(val);
				if(index!=-1)
				{
					Object obj=v.remove(index);
					System.out.println("Data found"+obj);
				}
				else {
					System.out.println("Data Not Found");
				}
				break;
			case 7://Fetch element by get method
				
				for(int i=0;i<v.size();i++)
				{
					Object obj=v.get(i);
					System.out.println(obj);
				}
				break;
			case 8: // sublist
				
				System.out.println("Enetr start index");
				int sti=s.nextInt();
				System.out.println("Enetr last index");
				int last=s.nextInt();
				List list=v.subList(sti, last);
				for(Object obj:list)
				{
					System.out.println(obj+"\t");
				}
				break;
			case 9:
				System.out.println("Enert Value for delete");
				val=s.nextInt();
				v.remove((Object)val);
				break;
			case 11:
				System.exit(0);
				break;
				default:
					System.out.println("Please Enter Currect Choice");
					break;
			}
		}
		while(ch!=11);	
	}
	

}

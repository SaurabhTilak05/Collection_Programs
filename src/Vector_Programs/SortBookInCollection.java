
// WAP to create Vector and store five book objects in vector and search book using id from collection.

package Vector_Programs;
import java.util.*;

class Book
{
	private int id;
	private String name;
	private int price;
	
	public Book(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

public class SortBookInCollection {

	public static void main(String[] args) {
		Vector v=new Vector();
		Scanner s=new Scanner(System.in);
		Book b=new Book(1,"Math",1200);
		Book b1=new Book(2,"Science",2000);
		Book b2=new Book(3,"History",1000);
		Book b3=new Book(4,"Hindi",1900);
		Book b4=new Book(5,"Marathi",4000);
		
		
		v.add(b);
		v.add(b1);
		v.add(b2);
		v.add(b3);
		v.add(b4);
		System.out.println("Book Data");
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			Book bk=(Book)obj;
			System.out.println(bk.getId()+"\t "+bk.getName()+"\t "+bk.getPrice());
		}
		System.out.println("Enter Book id For Searching Book");
		int bid=s.nextInt();
		boolean flag=false;
		for(int i=0;i<v.size();i++)
		{
			Book bk=(Book)v.get(i);
			if(bk.getId()==bid)
			{
				flag=true;
				break;
				
			}
		}
		if(flag)
		{	
			System.out.println("Book Found");
		}
		else {
			System.out.println("Book Not Found");
		}
		
		
	}

}

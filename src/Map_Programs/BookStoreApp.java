package Map_Programs;
import java.util.*;
import java.util.Map.Entry;
class Book{
	private int id;
	private String name;
	private int price;
	private String author;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book(int id, String name, int price, String author) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
	}
	
}
public class BookStoreApp {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		
		Book b=new Book(1, "Math", 200, "omkar");
		Book b1=new Book(2, "Boi", 400, "saurabh");
		Book b2=new Book(3, "Chemist", 500, "prajwal");
		Book b3=new Book(4, "marathi", 100, "tushar");
		
		ArrayList al=new ArrayList();
		al.add(b);
		al.add(b1);
		al.add(b2);
		al.add(b3);
		
		ArrayList al2=new ArrayList();
		al2.add(b);
		al2.add(b1);
		al2.add(b2);
		al2.add(b3);
		
		map.put("Programing", al);
		map.put("Spritual", al2);
		
		Set<Map.Entry> en=map.entrySet();
		for(Map.Entry e: en)
		{
			Object key=e.getKey();
			System.out.println("-------"+key+"-------");
			ArrayList ar=(ArrayList)e.getValue();
			System.out.println("--------------------------------");
			System.out.println("ID \t Name \t Price \t Author");
			System.out.println("--------------------------");
			for(Object o :ar)
			{
				Book bk=(Book)o;
				System.out.println(bk.getId()+"\t"+bk.getName()+"\t"+bk.getPrice()+"\t"+bk.getAuthor());
			}
		}

	}

}

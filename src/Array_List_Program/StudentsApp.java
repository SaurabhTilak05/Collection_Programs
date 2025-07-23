//Sort student by name 


package Array_List_Program;
import java.util.*;
class Students 
{
	private int id;
	private String name ;
	private int mark;
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
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public Students(int id, String name, int mark) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
	}
	public String toString() {	
		return id+"\t"+name+"\t"+mark;
	}
}
class SortByName implements Comparator<Students>{
	public int compare(Students s1, Students s2) {
		return s1.getName().compareTo(s2.getName());
	}
}
public class StudentsApp {

	public static void main(String[] args) {	
		Scanner s=new Scanner(System.in);
		ArrayList<Students> al=new ArrayList<>();
		Students stu[]=new Students[3];
		for(int i=0;i<stu.length;i++)
		{
			System.out.println("Enter Id Of the student");
			int id=s.nextInt();
			s.nextLine();
			System.out.println("Enter Name of the students ");
			String name=s.nextLine();
			
			System.out.println("Enter Marks ");
			int marks=s.nextInt();
			
			al.add(new Students(id,name,marks));
		}
		
		Collections.sort(al, new SortByName());
		System.out.println("Id\t name \t marks");
		
		for(Students stud:al) {
			System.out.println(stud);
		}
		
	}

}

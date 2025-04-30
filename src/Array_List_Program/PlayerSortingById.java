/*
 * . WAP to Create Player class with field id , name and salary and store 5 player data in ArrayList 
 * 	and sort the player data by using id with the help of Comparable interface
 */


package Array_List_Program;
import java.util.*;
class Player implements Comparable
{
	private int id;
	private String name;
	public Player(int id, String name, int run) {
		super();
		this.id = id;
		this.name = name;
		this.run = run;
	}
	private int run;
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
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	@Override
	public int compareTo(Object o) {
		Player plr=(Player)o;
		if(this.id<plr.id)
		{
			return -1;
		}
		else if(this.id >plr.id)
		{
			return 1;
		}
		else {
			return 0;
		}
	
	}
}
public class PlayerSortingById {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList al=new ArrayList();
		Player p=null;
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter Player id");
			int id=s.nextInt();
			s.nextLine();
			
			System.out.println("Enter Name Of Player");
			String name =s.nextLine();
			
			System.out.println("Enter Run of Player");
			int run=s.nextInt();
			
			p=new Player(id , name, run);
			al.add(p);
			
		}
		Collections.sort(al);
		System.out.println("Id\t Name \t run");
		for(Object obj : al)
		{
			Player pl=(Player)obj;
			System.out.println(pl.getId()+"\t"+pl.getName()+"\t"+pl.getRun());
		}
		
		
	}

}

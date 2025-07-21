/*
  WAP to create ArrayList and store 5 Player objects and find the 
  player detail using  second and third max highest run 
 */


package Array_List_Program;
import java.util.*;
class Players
{
		private int id;
		
		private String name;
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
		public Players(int id, String name, int run) {
			super();
			this.id = id;
			this.name = name;
			this.run = run;
		}	
		public String toString() {
		    return id + "\t" + name + "\t" + run;
		}
}

public class PlayreMax3rdMaxRun {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<Players> al=new ArrayList<>();
				
		Players pl[]=new Players[5];
		for(int i=0;i<pl.length;i++)
		{
			System.out.println("Enter id");
			int id=s.nextInt();
			s.nextLine();
			System.out.println("Enter Name: ");
			String name=s.nextLine();
			System.out.println("Enter Runs");
			int run=s.nextInt();
			pl[i]=new Players(id,name,run);
			al.add(pl[i]);
		}
		Collections.sort(al, new Comparator<Players>() {
		    public int compare(Players p1, Players p2) {
		        return p2.getRun() - p1.getRun(); 
		    }
		});
		  System.out.println("\n2nd Highest Runs Player: " + al.get(1));
	        System.out.println("3rd Highest Runs Player: " + al.get(2));
		
	}

}

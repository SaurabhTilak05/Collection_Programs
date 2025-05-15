package Map_Programs;
import java.util.*;
public class NestedMap {

	public static void main(String[] args) {
		Map<String, Map<Integer,String>> teams=new LinkedHashMap<>();
		Scanner s=new Scanner(System.in);
		while(true)
		{
			System.out.print("Country Name:  ");
			String cName=s.nextLine();
			if(cName.equals("exit")) {
				break;
			}
			Map<Integer,String> players=new LinkedHashMap<>();
			System.out.println("Enter all team Plyer Details");
			int count=1;
			while(true)
			{
				System.out.println("Enter palyer no . "+count+"Details: ");
				System.out.println("Joursy No:  ");
				int jsn=s.nextInt();
				s.nextLine();
				if(jsn<=0)
				{
					break;
				}
				System.out.print("Name:  ");
				String pName=s.nextLine();
				players.put(jsn, pName);
				
			}
			teams.put(cName, players);
		}
		Set<String>ctr=teams.keySet();
		Iterator<String> mitr =ctr.iterator();
		System.out.println("            Teams: ");
		System.out.println("---------------------------------");
		while(mitr.hasNext())
		{
			String mkey=mitr.next();
			System.out.println("Country Name:  "+mkey);
			System.out.println("---------------------------------");
			Map<Integer, String>prs=teams.get(mkey);
			for(Integer jn:prs.keySet()) {
				System.out.println(jn+":"+prs.get(jn));
			}
			System.out.println("---------------------------------");
		}
	}

}

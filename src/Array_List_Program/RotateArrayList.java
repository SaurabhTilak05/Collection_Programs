package Array_List_Program;
import java.util.*;
public class RotateArrayList {

	public static ArrayList<Integer> rotateRight(ArrayList<Integer> list, int k) {
        int n = list.size();
        k = k % n; 
        
        ArrayList<Integer> rotate=new ArrayList<>();
        for(int i=n-k;i<n;i++)
        {
        	rotate.add(list.get(i));
        }
        for(int i=0;i<n-k;i++)
        {
        	rotate.add(list.get(i));
        }
        return rotate;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("Enter arrayList elements");
		
		for(int i=0;i<5;i++)
		{
			al.add(s.nextInt());
		}
		 System.out.println("Enter k value to rotat ");
		 int k=s.nextInt();
		  ArrayList<Integer> result = rotateRight(al, k);
		System.out.println(result);
	}

}

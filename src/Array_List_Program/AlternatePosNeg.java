/* Rearrange Array in Alternating Positive and Negative Numbers
Question:
 Given an array of positive and negative numbers, rearrange them so that they appear in alternating positions (positive, negative, …). Extra elements go at the end.
Example:
 Input: [1, 2, 3, -4, -1, 4]
 Output: [-4, 1, -1, 2, 3, 4] or [1, -4, 2, -1, 3, 4]

 */

package Array_List_Program;

import java.util.*;


public class AlternatePosNeg {

	public static void rearrange(int arr[])
	{
		List<Integer> pos=new ArrayList<>();
		List<Integer> neg=new ArrayList<>();
		for (int num:arr) {
			if(num>= 0 ) {
				pos.add(num);
			}
			else {
				neg.add(num);
			}
		}
		int i=0,j=0,k=0;
		while(i<pos.size() && j<neg.size()) {
			arr[k++]=pos.get(i++);
			arr[k++]=neg.get(j++);			
		}
		while(i<pos.size()) {
			arr[k++]=pos.get(i++);
		}
		while(j<neg.size()) {
			arr[k++]=neg.get(j++);
		}
			
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int ar[]=new int[6];
		System.out.println("Enter Array Elements");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.nextInt();
		}
		rearrange(ar);
		System.out.println(Arrays.toString(ar));
	}
}

/*
 * WAP to create an Employee class and store  5 employee objects in the ArrayList collection 
    and perform the following operation on it.
	Case 1: View All Employee Data
	Case 2: Search Employee by using its id.
	Case 3: Delete Employee by using its id.
	Case 4: update employee name by using its id.
	Case 5: find the same name employee 

 */


package Array_List_Program;
import java.util.*;
class Employee
{
	private int id;
	private String name;
	private int sal;
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}	
	public String toString() {
		return 	id +"\t"+name +"\t"+sal;
	}
}
public class EmpArrayListOperation
{
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<Employee> emp=new ArrayList<>();
		Employee e=null;
		int ch;
		do {
			System.out.println("1:Add employee data ");
			System.out.println("2: View All Employee Data");
			System.out.println("3: Search Employee by using its id");
				System.out.println("4: Delete Employee by using its id");
				System.out.println("5: update employee name by using its id");
			System.out.println("6: find the same name employee ");	
			System.out.println("Enter 8 for Exit");
			ch=s.nextInt();
			
			switch(ch)
			{
			case 1:
				for(int i=0;i<2;i++) {
					e=new Employee();
					System.out.println("Enter id of Employee");
					int id=s.nextInt();
					s.nextLine();
					
					System.out.println("Enter Name Of Employee");
					String name=s.nextLine();
					
					System.out.println("Enter salary of Employee");
					int sal=s.nextInt();
					e.setId(id);
					e.setName(name);
					e.setSal(sal);
					emp.add(e);
				
				}
				break;
				
				
			case 2:
				
				System.out.println("---------- Emplloye Data --------------");
				System.out.println("Id \t Name \t Salary");
				for(Employee em: emp)
				{
					System.out.println(em);
				}
				
				break;
			case 3:
				System.out.println("Enter id to search Employee");
				int sid=s.nextInt();
				s.nextLine();
				boolean found=false;
				for(Employee em: emp)
				{
					if(em.getId()==sid)
					{
						System.out.println("Employee Found");
						System.out.println(em);
						found=true; 
						break;
					}
				}
				if(!found)
				{
					System.out.println("Employee not found");
				}
				
				break;
				
			case 4:
				System.out.println("Enter id to delete Employee");
				sid=s.nextInt();
				boolean delete=false;
				Iterator<Employee> itr=emp.iterator();
				while(itr.hasNext()) {
					Employee em=itr.next();
					if(em.getId()==sid)
					{
						itr.remove();
						System.out.println("Employee data delete successfully......!!!");
						delete=true;
						break;
					}
				}
				if(!delete)
				{
					System.out.println("Employee not found");
				}				
				break;
				
				
			case 5:
				System.out.println("Enter id to Udate Name of Employee");
				sid=s.nextInt();
				s.nextLine();
				boolean up=false;
				for(Employee em:emp)
				{
					if(em.getId()==sid)
					{
						System.out.println("Enter name to update Employee Name ");
						String nam=s.nextLine();
						s.nextLine();
						em.setName(nam);
						System.out.println("Employee name updated successfully.");
						up=true;
						break;
					}
					
				}
				if(!up)
				{
					System.out.println("Employee Id Fot Found");
				}
				break;
				
			case 6:
				System.out.print("Enter the name to find employees with the same name: ");
				String searchName = s.nextLine();
				List<Employee> sameNameEmp = new ArrayList<>();
				for(Employee em:emp)
				{
					em.getName().equalsIgnoreCase(searchName);
					sameNameEmp.add(em);
				}
				
				if (!sameNameEmp.isEmpty()) 
				{
					System.out.println("\n--- Employees with the name '" + searchName + "' ---");
					for (Employee employee : sameNameEmp) 
					{
						System.out.println(employee);
						System.out.println("------------------------------------------------");
					}
				}
				else {
					System.out.println("Employee Not Found Same name");
				}
				break;
			case 7:
				break;
				default :
					System.out.println("Wrong choice");
					break;
		}
		}while(ch!=7);
		
		
	}

}

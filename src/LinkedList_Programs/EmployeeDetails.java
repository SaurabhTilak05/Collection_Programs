/*
  WAP to create LinkedList and store 5 employee objects in it and Employee
   is POJO class and it contain id,name and salary  and display it 

 */
package LinkedList_Programs;
import java.util.*;
class Employee
{
	private int id;
	private String name;
	private int salary;
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
			public Employee(int id, String name, int salary) {
				super();
				this.id = id;
				this.name = name;
				this.salary = salary;
			}
			public int getSalary() {
				return salary;
			}
			public void setSalary(int salary) {
				this.salary = salary;
			}
			public String toString() {
			    return id + ", " + name + ", " + salary;
			}
	
	}
public class EmployeeDetails {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Employee emp[]=new Employee[2];
		LinkedList<Employee> list=new LinkedList<>();
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("Enter Id Of the Employee");
			int id=s.nextInt();
			s.nextLine();
			System.out.println("Enter Name Of The Employee");
			String name=s.nextLine();
			System.out.println("Enter Salary of the employee");
			int sal=s.nextInt();
			emp[i]=new Employee(id,name,sal);
			list.add(emp[i]);
		}
	
		for(Employee em:list) {
			System.out.println(em);
		}
		

	}

}

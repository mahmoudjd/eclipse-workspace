package my_firstoopproject;

public class Employee {

	int emp_id;
	String ename ;
	String depart;
	double salary;
	double bonus;
	boolean resident;
	
	public Employee () {
		emp_id= 100;
		ename= "No Name";
		salary = 3000;
		bonus = 500;
		depart="Not assigned yet ";
		resident = true ;
		
	}
	public Employee(int id , String name ) {
		emp_id = id ;
		ename = name ;
		
	}
	public Employee (int id , String name ,boolean res) {
	   this (id ,name );
	   resident=res;
		
	}
	public Employee(int id , String name ,boolean r,double c, double b, String d )
	{
		this(id,name,r);
		 salary= c;
		 bonus= b;
		 depart=d ;
	}
	
public void print_emp()
{
	System.out.println("ID : "+emp_id);
	System.out.println("Name : "+ ename );
	System.out.println("depart : "+ depart);
	System.out.println("salary : "+salary);
	System.out.println("bonus : "+bonus);
	System.out.println("resident : "+resident);
}


}

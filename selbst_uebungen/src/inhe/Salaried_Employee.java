/**
 * 
 */
package inhe;

/**
 * @author Mahmoud Jd
 *
 */
public class Salaried_Employee  extends Employee {

	double bonus;
	double deduction ;
	
	public Salaried_Employee() {

	
	}
	
	public Salaried_Employee(String n, double a, String ad , String nat, double sal, String r, String j, double b ,double d) 
	{
		super(n,a,ad,nat,sal,r,j);
		bonus = b;
		deduction= d;
	}
	@Override
	public double getSalary() {
		return (salary + bonus)-deduction;
		
	}
}

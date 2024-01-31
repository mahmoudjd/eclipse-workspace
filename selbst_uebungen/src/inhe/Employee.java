package inhe;

public class Employee extends person {

	double salary;
	String rank;
	String job;
	public Employee() {
		
		// TODO Auto-generated constructor stub
	}
	public Employee(String n, double a,String ad,String nat,double sal,String r, String j) 
	{
	super(n,a,ad,nat);
	salary= sal;
	rank=r;
	job= j;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @return the rank
	 */
	public String getRank() {
		return rank;
	}
	/**
	 * @param rank the rank to set
	 */
	public void setRank(String rank) {
		this.rank = rank;
	}
	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}
	/**
	 * @param job the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public void print_all_details() {
		super.print_all_details();
		System.out.print("Job: "+job+"\nRank: "+rank+"\nsalary:"+salary);
	}
	

}

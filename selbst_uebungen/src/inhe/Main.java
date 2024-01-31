package inhe;

public class Main {

	public static void main(String[] args) {
//		student std1 = new student("Mahmoud", 25,"Saarbruecken","Syrer",3,"Informatik",15);
//		System.out.println(std1.getName());
//		System.out.println(std1.getAge());
//		System.out.println(std1.getSpecialy());
//		System.out.println(std1.getAddress());
//		System.out.println(std1.getGPA());
//		
//		Salaried_Employee sal= new Salaried_Employee("Ahmad",30,"saarland","syrer",3000,"Maneger","Informatiker",500,100 );
//		System.out.println(sal.getSalary());
		Employee e1 = new Employee("Ahmad",30,"saarland","syrer",3000,"Maneger","Informatiker");
		e1.print_all_details();
	}

}

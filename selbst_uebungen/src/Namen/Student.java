package Namen;

import java.util.Collections;
//import java.util.Comparator;
//import java.util.Iterator;

//import java.util.Scanner;
import java.util.ArrayList;
//import java.util.Collection;

public class Student implements Comparable<Student> {
	
	private String name ; 
	private int alt ; 
	private String beruf ;
	
	

	public Student(String name, int alt, String beruf) {
		
		this.name = name;
		this.alt = alt;
		this.beruf = beruf;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAlt() {
		return alt;
	}



	public void setAlt(int alt) {
		this.alt = alt;
	}



	public String getBeruf() {
		return beruf;
	}



	public void setBeruf(String beruf) {
		this.beruf = beruf;
	}



	@Override
	public String toString() {
		return "Student [name=" + this.name + ", alt=" + this.alt + ", beruf=" + this.beruf + "]";
	}

	
	public int compareTo (Student s ) {
		if(this.alt > s.alt)
			return 1 ; 
		else 
			return -1 ;
	}

	public static void main ( String [] args) {
	
		
		ArrayList<Student> students = new ArrayList<>();
		Student s1 = new Student ("Ahmad",22,"Schüler") ;
		students.add(new Student("Mahmoud",26,"Student"));
		students.add(s1) ;
		students.add(new Student("Nouralhouda",16,"Schülerin"));
		students.add(new Student("Ekhlas",14,"Schülerin"));
		students.add(new Student("Anas",11,"Schüler"));
		
//		Iterator <Student> i = students.iterator();
//		
//		while( i.hasNext())
//			System.out.println(i.next());
//		Comparator <Student> com = new Comparator<Student>() {
//			public int compare(Student s1 , Student s2) {
//				if (s1.getAlt() > s2.getAlt())
//					return 1 ;
//				else 
//					return -1;
//				  
//			}
//		};
		Collections.sort(students);
		//Collections.sort(students,com);
		
		for (Student s : students)
			System.out.println(s);
		
/*	
		//	Scanner input = new Scanner (System.in);
		ArrayList <String> students = new ArrayList<>() ;
		
		
//		while(input.hasNext()) {
//			String s = input.next();
//			students.add(s);
//			
//			System.out.println("Bisher wurden "+students.size()+" Studenten erfasst");
//			
//			
//		
//		}
		students.add("Mahmoud");
		students.add("Ahmad");
		students.add("Nouralhouda");
		students.add("Ekhlas");
		students.add("Anas");
		
//		System.out.println("1: ");
//		
//		for(String s : students) {
//			System.out.print(s+" ");
//		}
//		
//		System.out.println("\n2: ");
//		students.remove(0);
//		
//		for(String s : students )
//			System.out.print(s+" ");
//	
//		System.out.println("\n3: ");
//		students.remove(3);
//		
//		for(String s : students )
//			System.out.print(s+" ");
//		
//		System.out.println("\n4:  ");
//		students.clear();
//		
//		for(String s : students )
//			System.out.print(s+" * ");
//	

		Collections.sort(students);
		
		for (String s : students ) {
			System.out.println(s);
		}
		//students.clear();
		
	
	  	if(students.isEmpty())	 
	  		System.out.println("Die Liste ist Leer ");
	 
	 
	 
		System.out.println("Mit Iteration: ");
		Iterator<String> i = students.iterator();
		while(i.hasNext())
			System.out.println(i.next());
*/
	}



	
}

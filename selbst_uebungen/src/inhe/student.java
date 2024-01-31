 package inhe;

public class student extends person {

	int study_level;
	String specialy;
	double GPA;
	public student() {
	
	}
//public student(String n, double a, String ad, String nat,int lvl,String special, double gpa) 
//{
//	name = n;
//	age= a;
//	nationality = nat ;
//	address= ad;
//	study_level= lvl;
//	specialy= special;
//	GPA = gpa;
//}

	public student(String n, double a, String ad, String nat,int lvl,String special, double gpa) 
	{
		super(n,a,ad,nat);
		study_level= lvl;
		specialy= special;
		GPA = gpa;
		
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public int getStudy_level() {
		return study_level;
	}

	public void setStudy_level(int study_level) {
		this.study_level = study_level;
	}

	public String getSpecialy() {
		return specialy;
	}

	public void setSpecialy(String specialy) {
		this.specialy = specialy;
	}
	

	
}

package root;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	private static ArrayList<Person> p;
	
	public static void main(String[] args) {
		if(args.length==1) {
			p = new ArrayList<Person>();
			try {
				BufferedReader br=new BufferedReader(new FileReader(args[0]));
				String line = br.readLine();
				while (line != null) {
					parseLine(line);
					line = br.readLine();
				}
				br.close();
			}catch(IOException e) {
				System.out.println("kann nicht einlesen");
			}
			calcminmaxavg();
			calculaterank();
			}
		else {
			System.out.println("geben sie bitte Kommandozeilenargument");
		}
		
	}
	public static void parseLine(String line ) {
		String[] person = line.split(",");
		if (person.length < 4) {
			System.out.println("Falsch");
			return;
		}
		p.add(new Person(person[0],person[1],person[2],Integer.parseInt(person[3])));
		
	}
	private static void calcminmaxavg() {
		if (p.size()>0) {
			Person min = p.get(0);
			Person max = p.get(0);
			int total = 0;
			for (Person curr : p) {
				if (curr.getPoints()<min.getPoints())
					min = curr;
				if (curr.getPoints()> max.getPoints())
					max=curr;
				total+=curr.getPoints(); 
			}
			double avg = (double)total / p.size();
			System.out.println("AVG: "+avg);
			System.out.println("Min: "+min.toString());
			System.out.println("Max: "+max.toString());
		}
	}
	private static void calculaterank() {
		Collections.sort(p,new Personcomparator());
		for (Person curr : p)
			System.out.println(curr.toString());
	}
}

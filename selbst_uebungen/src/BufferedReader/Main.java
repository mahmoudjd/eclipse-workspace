package BufferedReader;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	private static ArrayList<Person> pers;
	public static void main (String[] args) {
		if(args.length ==1) {
			pers = new ArrayList<Person>();
			try {
				BufferedReader br= new BufferedReader(new FileReader(args[0]));
				String line = br.readLine();
				while(line != null) {
					parseLine(line);
					line = br.readLine();
				}
				rankingColl();
				calculate();
				br.close();
			}catch(IOException e) {
				System.out.println("Datei kann nicht gelesen werden");
			}
		}
		else {
				System.out.println("Falsch Args");
			
		}
	}
	private static void parseLine(String line) {
		String[] person= line.split(",");
		if(person.length <4) {
			System.out.println("False");
			return;
		}
		pers.add(new Person(person[0],person[1],person[2],Integer.parseInt(person[3])));
	}
	private static void calculate() {
		if(pers.size()>0) {
			Person min = pers.get(0);
			Person max = pers.get(0);
			int total= 0;
			for(Person p : pers) {
				if(p.getPoint()<min.getPoint())
					min = p;
				if(p.getPoint()> max.getPoint())
					max= p;
				total += p.getPoint();
			}
			double avg= (double )total/ pers.size();
			System.out.println("Min Person : "+min.toString());
			System.out.println("Max Person : "+ max.toString());
			System.out.println("AVG von Punkten: "+avg);
		}
	}
	private static void rankingColl() {
		Collections.sort(pers,new PersonCmp());
		for(Person p: pers) {
			System.out.println(p.toString());
		}
	}
}

package readwritefile;

import java.util.*;
import java.io.*;

public class FileIO {

    public static List<String> readFile(String filename) {
	List<String> lines = new ArrayList<>();
	String line = "";
	try (BufferedReader br = new BufferedReader(new FileReader(filename))) { 
	    while((line = br.readLine()) != null )
		lines.add(line);
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	}
	return lines;
    }
    
    public static void writefile(List<String> lines, String outfile) { 
	try (PrintWriter pw = new PrintWriter(outfile)) { 
	    for (String line : lines) {
		pw.write(line+"\n");
	    }
	} catch (IOException e) { 
	    e.printStackTrace();
	}
	
    }
    
    public static void main(String[] args) {
	String name = "inFile.txt";
	List<String> lines = readFile(name);
	
	String outfile = "outFile.txt";
	
	writefile(lines, outfile);
	
    }
}

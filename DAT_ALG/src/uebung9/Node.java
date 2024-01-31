package uebung9;

public class Node {
	// Einzelner Knoten eines Trees
	
	  // Der int-Wert, der die Daten des Nodees repräsentiert
	  public int data;
	  
	  // Referenz auf linken Sohn
	  public Node left;
	  
	  // Referenz auf rechten Sohn
	  public Node right;
	  
	  // Konstruktor, dem der Anfangswert des Nodees übergeben wird.
	  public Node(int value)
	  {
	    data = value;
	  }
}



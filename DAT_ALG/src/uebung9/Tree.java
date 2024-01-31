package uebung9 ;
// Binaerer Baum, der aus einzelnen Node-Objekten aufgebaut ist.
// Ein Baum wird hier immer durch Angabe von <lefttree, root, righttree> aufgebaut.
public class Tree
{
  //Referenz auf die Wurzel des Baumes
  private Node root;
  Tree () 
  {
	  
  }
  
  // Liefert einen leeren Baum zurück
  public static Tree empty()
  {
    return new Tree();
  }
  
  // Baut aus zwei Teilbäumen und einem Wert einen neuen Baum, dessen Wurzel
  // ein Node mit dem übergebenen Wert ist
  public static Tree makeTree(Tree leftTree, Node root, Tree rightTree)
  {
    Tree myNewTree = new Tree();
    myNewTree.root = root;
    myNewTree.root.left = leftTree.root;
    myNewTree.root.right = rightTree.root;
    //root.left = leftTree.root;
    //root.right = rightTree.root;
    
    return myNewTree;
  }
  
  // Liefert den Wurzelknoten des übergebenen Baumes
  public static Node key(Tree t)
  {
    return t.root;
  }
  
  // Liefert den linken Teilbaum eines Baumes zurück
  public static Tree leftTree(Tree t)
  {
    // für einen leeren Baum gibt es keinen linken Teilbaum
    if ( t.root == null )
    {
      System.out.println("Der leere Baum hat keinen linken Teilbaum!");
      return null;
    }
    Tree myNewTree = new Tree();
    myNewTree.root = t.root.left;
    return myNewTree;
  }
  
  
  
  // Liefert den rechten Teilbaum eines Baumes zurück
  public static Tree rightTree(Tree t)
  {
    // für einen leeren Baum gibt es keinen rechten Teilbaum
    if ( t.root == null )
    {
      System.out.println("Der leere Baum hat keinen rechten Teilbaum!");
      return null;
    }
    Tree myNewTree = new Tree();
    myNewTree.root = t.root.right;
    return myNewTree;
  }
  
  // Testet, ob der Baum leer ist.
  public static boolean isEmpty(Tree t)
  {
    return t.root == null;
  }
  
  // Gibt die preorder - Darstellung eines Baumes als String zurück
  public static String preorder(Tree t)
  {
    // für leeren Baum
    if ( isEmpty(t))
    {
      return "";
    }
    else
    {
      String s = "" + t.root.data;
      //String s = "" + key(t).data;  //alternativ immer möglich 
      String left = preorder(leftTree(t));
      if (left != "")
      s += "," + left;
      String right = preorder(rightTree(t));
      if (right != "")
      s += "," + right;
      
      return s;
    }
  }
  
  // Gibt die inorder - Darstellung eines Baumes als String zurück
  public static String inorder(Tree t)
  {
    // für leeren Baum
    if ( t.root == null )
    {
      return "";
    }
    else
    {
      String s = "";
      String left = inorder(leftTree(t));
      s += left;
      if (left != "")
    	  s += ",";
      s += t.root.data;
      String right = inorder(rightTree(t));
      if (right != "")
    	  s += ",";
      s += right;
      
      return s;
    }
  }
  
  
  
  // Gibt die postorder - Darstellung eines Baumes als String zurück
  public static String postorder(Tree t)
  {
    // für leeren Baum
    if ( t.root == null )
    {
      return "";
    }
    else
    {
      String s = "";
      String left = postorder(leftTree(t));
      s += left;
      if (left != "")
         s += ",";
      String right = postorder(rightTree(t));
      s += right;
      if (right != "")
         s += ",";
      s += t.root.data;
      
      return s;
    }
  }
  
  // Gibt die Anzahl der Node eines Baumes als Wert zurück
  public static int anzKnoten (Tree t)
  {
    // für leeren Baum
    if ( t.root == null )
    {
      return 0;
    }
    else
    {
      return 1 + anzKnoten(rightTree(t)) + anzKnoten(leftTree(t));
    }
  }
  
  // Gibt die Anzahl der Blätter eines Baumes als Wert zurück
  public static int anzBlaetter (Tree t)
  {
    // für leeren BaumTree t
    if ( t.root == null )
    {
      return 0;
    }
    else
    {
      if (t.root.left == null && t.root.right == null)
      return 1;
      else 
      return anzBlaetter(rightTree(t)) + anzBlaetter(leftTree(t));
    }
  }
  
  // Gibt die Hoehe eines Baumes als Wert zurück
  public static int hoehe (Tree t)
  {
    // für leeren Baum
    if ( t.root == null )
    {
      return -1;
    }
    else
    {
      return (1 + Math.max(hoehe(leftTree(t)),hoehe(rightTree(t))));
    }
  }
  // main-Methode zum Testen
  public static void main(String[] args)
  {
    //Erstellen von Knoten
    Node node1 = new Node(1);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    Node node7 = new Node(7);
    Node node8 = new Node(8);
    Node node30 = new Node(30);
    Node node10 = new Node(10);
    Node node999 = new Node(999);
    
    
    Tree leer = empty();
    
    Tree first  = makeTree(empty(), node1, empty());
    Tree second = makeTree(empty(), node3, empty());
    Tree third  = makeTree(first, node4, second);
    
    Tree fourth = makeTree(empty(), node7, empty());
    Tree fifth  = makeTree(empty(), node8, empty());
    Tree sixth  = makeTree(fourth, node30, fifth);
    
    Tree root   = makeTree(third, node10, sixth);
    Tree test   = makeTree(third, node999, root);
    
    System.out.println("\nTest-Tree t:            999");
    System.out.println("                     /      \\ ");
    System.out.println("                   4          10");
    System.out.println("                  / \\       /  \\ ");
    System.out.println("                 1   3     4    30");
    System.out.println("                          / \\   / \\ ");
    System.out.println("                         1   3  7  8");
    
    System.out.println("\n preorder(t):");
    System.out.println("<" + preorder(test) + ">");
    
    System.out.println("\n inorder(t):");
    System.out.println("<" + inorder(test) + ">");
    
    System.out.println("\n postorder(t):");
    System.out.println("<" + postorder(test) + ">");
    
    System.out.println("\n Die Anzahl der Knoten betraegt: " + anzKnoten(test));
    System.out.println("\n Die Anzahl der Blaetter betraegt: " + anzBlaetter(test));
    System.out.println("\n Die Hoehe des Baumes betraegt: " + hoehe(test));
    
    System.out.println("\n Die Anzahl der Knoten des Baumes first betraegt: " + anzKnoten(first));
    System.out.println("\n Die Hoehe des Baumes first betraegt: " + hoehe(first));
    System.out.println("\n Die Anzahl der Blaetter des Baumes first betraegt: " + anzBlaetter(first));
    
    System.out.println("\n Die Anzahl der Knoten des leeren Baumes betraegt: " + anzKnoten(leer));
    System.out.println("\n Die Hoehe des leeren Baumes betraegt: " + hoehe(leer));
    
  }
}
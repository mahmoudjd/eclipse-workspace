package uebung10;

  // Binaerer Suchbaum, der aus einzelnen Knoten-Objekten(Nodes) aufgebaut ist.
// Jeder Wert kann im Baum nur einmal vorkommen.
public class SearchTree1
{
  //Referenz auf die Wurzel des Baumes
  private Node root;

  // Konstruktor zum Erzeugen des leeren Baumes
  public SearchTree1()
  {
    root = null;
  }
  
  // Methode zum Einfuegen eines Knotens in den Baum
  public void insert(int value)
  {
    Node elem =root;
    Node toInsert = new Node(value);
    
    if (isEmpty())
    {
      root = toInsert;
      return;
    }
    if (!member(value))
       while (!member(value))
             {
                   if (elem.data > value)
                   {
                      if (elem.left == null)
                         elem.left = toInsert;
                      else
                         elem = elem.left;
                   }
                   else
                   {
                      if (elem.right == null)
                         elem.right = toInsert;
                      else
                         elem = elem.right;
                   }
             }
                
  }
  
  // Loescht Knoten mit dem �bergebenen Wert aus dem Baum, falls ein
  // solcher vorhanden ist.
  public void delete(int value)
  {
    Node toDelete = find(value);
    
    // Node nicht gefunden
    if (toDelete == null)
    {
      return;
    }
    else
    { 
      // Wenn der zu loeschende Knoten nichtleere linke und rechte
      // Teilb�ume hat, wird der zu loeschende Knoten durch den 
      // kleinsten Knoten des rechten Teilbaumes ersetzt
      if ( toDelete.left != null && toDelete.right != null )
      {
        SearchTree1 temp = new SearchTree1();
        temp.root = toDelete;
        Node minRightTreeNode = temp.rightTree().getMin();
        
        toDelete.data = minRightTreeNode.data;
        if (toDelete.right == minRightTreeNode)
        {
          toDelete.right = minRightTreeNode.right;
        }
        else
        {
          temp.rightTree().delete(minRightTreeNode.data);
        }
      }
      else
      {
        Node parent = findParent(toDelete);
        
        // Zu loeschender Knoten ist ein Blatt
        if (toDelete.left == null && toDelete.right == null)
        {
          // Zu loeschender Knoten ist die Wurzel
          if (parent == null)
            root = null;
          else if (parent.left == toDelete)
            parent.left = null;
          else
            parent.right = null;
        }
        else
        {
          // Zu loeschender Knoten ist die Wurzel
          if (parent == null)
          {
            if (toDelete.left == null)
              root = toDelete.right;
            else
              root = toDelete.left;
          }
          //zu loeschender Knoten ist innerer Knoten mit einem Nachfolger
          else if (parent.left == toDelete)
          {
            if (toDelete.left == null)
              parent.left = toDelete.right;
            else
              parent.left = toDelete.left;
          }
          else  // parent.right == toDelete
          {
            if (toDelete.left == null)
              parent.right = toDelete.right;
            else
              parent.right = toDelete.left;
          }
        }
      } 
    }
  }

  // Hilfsmethode, nur aus delete() heraus benutzt
  private Node getMin()
  {
    if (root.left == null)
      return root;
    else
      return leftTree().getMin();
  }
  
  // Hilfsmethode, nur aus delete() heraus benutzt
  private Node findParent(Node child)
  {
    if (root == child || root == null)
      return null;
    else if (root.left == child || root.right == child)
      return root;
    else
    {
      Node temp = leftTree().findParent(child);
      if (temp != null)
        return temp;
      else
        return rightTree().findParent(child);
    }   
  }
    
  // Testet, ob der Baum leer ist.
  public boolean isEmpty()
  {
    return (root == null);
  }
  
  // Sucht einen Knoten mit dem �bergebenem Wert im Suchbaum. Wenn ein
  // solcher vorhanden ist, wird eine Referenz auf diesen Knoten
  // zurueckgegeben, sonst null.
  public Node find(int value)
  {
    Node elem = root;
    if (elem == null)
       return null;
    else
      if (elem.data == value)
         return elem;
    else
      if (elem.data > value)
        return leftTree().find(value);
    else
       return rightTree().find(value);       
  }
  
  
 /* 
  // Prueft, ob ein Knoten mit dem uebergebenen Wert im Baum vorhanden ist
  public boolean member(int value)
  {
    Node elem = root;
                if (elem == null)
                  return false;
                else
                  if (elem.data == value)
                    return true;
                  else
                    if (elem.data > value)
                      return leftTree().member(value);
                    else
                      return rightTree().member(value); 
  }
  
  */
  
  // Prueft, ob ein Knoten mit dem uebergebenen Wert im Baum vorhanden ist
  public boolean member(int value)
  {
    return (find(value) != null);
  }
  
  public SearchTree1 leftTree()
  {
    if ( root == null)
    {
      System.out.println("Der leere Baum hat keinen linken Teilbaum!");
      return null;
    }
    SearchTree1 leftTree = new SearchTree1();
    leftTree.root = this.root.left;
    return leftTree;
  }
  
  public SearchTree1 rightTree()
  {
    if ( root == null)
    {
      System.out.println("Der leere Baum hat keinen rechten Teilbaum!");
      return null;
    }
    SearchTree1 rightTree = new SearchTree1();
    rightTree.root = this.root.right;
    return rightTree;
  }
      
  // Gibt die preorder - Darstellung eines Baumes als String zur�ck
  public String preorder()
  {
    if (isEmpty())
                  return "";
                else
                  return (root.data + " " + leftTree().preorder() + rightTree().preorder());
  }
  
  // Gibt die inorder - Darstellung eines Baumes als String zur�ck
  public String inorder()
  {
    if (isEmpty())
                  return "";
                else
                  return (leftTree().inorder() + root.data + " " + rightTree().inorder());
  }

  // Gibt die postorder - Darstellung eines Baumes als String zur�ck
  public String postorder()
  {
          if (isEmpty())
                  return "";
                else
                  return (leftTree().postorder() + rightTree().postorder() + " " + root.data);
  }
  
  // Gibt die Werte der Knoten des Baumes im Breitendurchlauf 
  // als String zur�ck
  public String breitendurchlauf()
  {     
    if (isEmpty())
      return "";
    else
    {
        ElementQueue q = new ElementQueue();
        q.enqueue(root);
        String erg = "";
        while (!q.isEmpty())
        {
          Node elem = q.dequeue();
          erg += elem.data + " ";
          if (elem.left != null)
            q.enqueue(elem.left);
          if (elem.right != null)
            q.enqueue(elem.right);
        }
      return erg;  
    } 
  }
  
  // Gibt die Anzahl der Node eines Baumes als Wert zur�ck
  public int anzKnoten()
  {
    // f�r leeren Baum
    if ( isEmpty() )
    {
      return 0;
    }
    else
    {
      return 1 + rightTree().anzKnoten() + leftTree().anzKnoten();
    }
  }
  
  // Gibt die Anzahl der Bl�tter eines Baumes als Wert zur�ck
  public  int anzBlaetter()
  {
    // f�r leeren Baum
     if ( isEmpty() )
     {
       return 0;
     }
     else
     {
       if (leftTree().root == null && rightTree().root == null)
          return 1;
      else 
          return rightTree().anzBlaetter() + leftTree().anzBlaetter();
     }
  }
  
  // Gibt die Hoehe eines Baumes als Wert zur�ck
  public int hoehe ()
  {
    // f�r leeren Baum
    if ( isEmpty() )
    {
      return -1;
    }
    else
    {
      return (1 + Math.max(leftTree().hoehe(),rightTree().hoehe()));
    }
	  /*
	  if (root == null )
		  return -1 ; 
	  if (root.right == null && root.left == null )
		  return 0; 
	  else 
		  return Math.max(leftTree().hoehe(), rightTree().hoehe())+1;
		  */
  }
  
    
  // main-Methode zum Testen
  public static void main(String[] args)
  {
    SearchTree1 st = new SearchTree1();
    st.insert(2);
    st.insert(10);
    st.insert(-6);
    st.insert(4);
    st.insert(46);
    st.insert(0);
    st.insert(2);
    st.insert(5);
    st.insert(-5);
    st.insert(4);
    st.insert(7);
    st.insert(11);
    st.insert(1);
    
    System.out.println("\n Anzahl Knoten: " + st.anzKnoten());
    
    System.out.println("\n Anzahl Bl�tter: " + st.anzBlaetter());
    
    System.out.println("\n H�he des Baumes: " + st.hoehe());
    
    System.out.println("\n preorder:");
    System.out.println("<" + st.preorder() + ">");
    
    System.out.println(" inorder:");
    System.out.println("<" + st.inorder() + ">");
    
    System.out.println(" postorder:");
    System.out.println("<" + st.postorder() + ">");
    
    System.out.println(" breitendurchlauf:");
    System.out.println("<" + st.breitendurchlauf() + ">");
    
    st.delete(0);
    st.delete(8);
    st.delete(2);
    st.delete(4);
    st.delete(11);
    
    System.out.println("\n preorder:");
    System.out.println("<" + st.preorder() + ">");
    
    System.out.println(" inorder:");
    System.out.println("<" + st.inorder() + ">");
    
    System.out.println(" postorder:");
    System.out.println("<" + st.postorder() + ">");
    
    System.out.println(" breitendurchlauf:");
    System.out.println("<" + st.breitendurchlauf() + ">");
      
    SearchTree1 st2 = new SearchTree1();
    st2.insert(10);
    st2.insert(5);  
    st2.insert(3);
    st2.insert(15);
    st2.delete(10);
    System.out.println(" breitendurchlauf:");
    System.out.println("<" + st2.breitendurchlauf() + ">");
      
  }
}


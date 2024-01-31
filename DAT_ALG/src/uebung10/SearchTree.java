package uebung10;

import utilities.TastaturEingabe;

// Bin�rer Suchbaum, der aus einzelnen Node-Objekten aufgebaut ist.
// Jeder Wert kann im Baum nur einmal vorkommen.
public class SearchTree
{
	//Referenz auf die Wurzel des Baumes
	private Node root;

	// Konstruktor zum Erzeugen des leeren Baumes
	public SearchTree()
	{
		root = null;
	}
	
	// Methode zum Einf�gen eines Nodes in den Baum
	public void insert(int value)
	{
		root = hilfe_insert(root ,value);
		
	}
	public Node hilfe_insert(Node root, int value ) {
		//tree is empty
        if (root == null) {
            root = new Node(value);
            return root;
        }
        else {
        	if(!member(value)) 
        	{
	        	if (root.data < value)
	        		root.right =hilfe_insert(root.right,value);
	        	else 
	        		root.left =hilfe_insert(root.left,value);
            }
        return root;
        }
	}
	
	// L�scht Knoten mit dem �bergebenen Wert aus dem Baum, falls ein
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
			// Wenn zu l�schender Knoten nichtleere linke und rechte
			// Teilb�ume hat, wird der zu l�schende Knoten durch das 
			// kleinste Node des rechten Teilbaumes ersetzt
			if ( toDelete.left != null && toDelete.right != null )
			{
				SearchTree temp = new SearchTree();
				temp.root = toDelete;
				Node minRightTree = temp.rightTree().getMin();
				
				toDelete.data = minRightTree.data;
				if (toDelete.right == minRightTree)
				{
					toDelete.right = minRightTree.right;
				}
				else
				{
					temp.rightTree().delete(minRightTree.data);
				}
			}
			else
			{
				Node parent = findParent(toDelete);
				
				// Zu l�schender Knoten ist ein Blatt
				if (toDelete.left == null && toDelete.right == null)
				{
					// Zu l�schendes Node ist die Wurzel
					if (parent == null)
						root = null;
					else if (parent.left == toDelete)
						parent.left = null;
					else
						parent.right = null;
				}
				else
				{
					// Zu l�schender Knoten ist die Wurzel
					if (parent == null)
					{
						if (toDelete.left == null)
							root = toDelete.right;
						else
							root = toDelete.left;
					}
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
	// liefert den minimalen Knoten eines bin�ren Suchbaums
	private Node getMin()
	{
		Node min = root ;
		if(isEmpty()) {
			min= null ;
		}
		else {
			if (min.left == null)
				return root;
			else 
				min= leftTree().getMin();
		}
		return min;
	}
	
	// Hilfsmethode, nur aus delete() heraus benutzt
	// liefert zu einem gegebenen Knoten child den Vater-Knoten
	private Node findParent(Node child)
	{
		if (isEmpty() || child == root)
			return null;
		else
		{
			Node parent= root;
			Node node = root;
			if(root.left== child || root.right ==child)
				return parent;
			else if(child.data< node.data ) {
				parent = leftTree().findParent(child);
			}
			else 
				parent= rightTree().findParent(child);
			return parent;
		}
	}
		
	// Testet, ob der Baum leer ist.
	public boolean isEmpty()
	{
		return root == null ;
	}
	
	// Sucht einen Knoten mit dem �bergebenen Wert im Suchbaum. Wenn ein
	// solcher vorhanden ist, wird eine Referenz auf diesen Knoten
	// zur�ckgegeben, sonst null.
	public  Node find(int value)
	{
		Node node = root ;
		if (isEmpty())
			return null ;
		else {
			if (root.data == value )
				return root ;
			else if(root.data > value)
				node =leftTree().find(value);
			else 
				node =rightTree().find(value);
		}
		return node;
		
	}
	
	// Pr�ft, ob ein Knoten mit dem �bergebenen Wert im Baum vorhanden ist
	public boolean member(int value)
	{
		if (isEmpty())
			return false ;
		else {
			boolean test ;
			if (root.data == value )
				test = true;
			else if(root.data > value )
				test =leftTree().member(value);
			else 
				test =rightTree().member(value);
			return test ;
		}
	}
	
	public SearchTree leftTree()
	{
		if ( root == null)
		{
			System.out.println("Der leere Baum hat keinen linken Teilbaum!");
			return null;
		}
		SearchTree leftTree = new SearchTree();
		leftTree.root = this.root.left;
		return leftTree;
	}
	
	public SearchTree rightTree()
	{
		if ( root == null)
		{
			System.out.println("Der leere Baum hat keinen rechten Teilbaum!");
			return null;
		}
		SearchTree rightTree = new SearchTree();
		rightTree.root = this.root.right;
		return rightTree;
	}
			
	// Gibt die preorder - Darstellung eines Baumes als String zur�ck
	public String preorder()
	{

        if(isEmpty())
        {
            return "";
        }
        else {
            String s = "" +root.data;
            String left = leftTree().preorder();
            if(left != "")
            {
                s += "," + left;
            }
            String right = rightTree().preorder();
            if(right != "")
            {
                s+="," +right;
            }

            return s;
        }
	}
	
	// Gibt die inorder - Darstellung eines Baumes als String zur�ck
	public String inorder()
	{
		  if(isEmpty() ){
	            return "" ;
	        }
	        else {
	            String s= "";
	            String left =leftTree().inorder();
	            s+=left;
	            if(left != "")
	            {
	                s+=",";
	            }
	            s+=root.data;
	            String right = rightTree().inorder();
	            if(right != "")
	            {
	                s+=",";
	            }
	            s+=right;
	            return s;
	        }
	}
	
	// Gibt die postorder - Darstellung eines Baumes als String zur�ck
	public String postorder()
	{
		 if (isEmpty()) {
	            return "";
	        } else {
	            String s = "";
	            String left = leftTree().postorder();
	            s += left;
	            if (left != "") {
	                s += ",";
	            }
	            String right = rightTree().postorder();
	            s += right;
	            if (right != "") {
	                s += ",";
	            }
	            s += root.data;
	            return s;
	        }
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

		
	// main-Methode zum Testen
	public static void main(String[] args)
	{
		SearchTree st = new SearchTree();
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
		
		System.out.println("\n preorder:");
		System.out.println("<" + st.preorder() + ">");
		
		System.out.println(" inorder:");
		System.out.println("<" + st.inorder() + ">");
		
		System.out.println(" postorder:");
		System.out.println("<" + st.postorder() + ">");
		Node child = st.find(TastaturEingabe.readInt("Bitte gib einen Wert ein :"));
		Node vater= st.findParent(child);
		System.out.println("Vater : "+vater.data);
		
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
	}
}
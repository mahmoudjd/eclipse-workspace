package uebung8;
import utilities.TastaturEingabe;

public class myStack
{
    private int [] feld= new int[100];	// Array zum Anlegen des Stack
    private int index;					// Index, der auf den naechsten freien Kellerplatz zeigt
  	

	public myStack() { 
				index = 0;		// leerer Stack	
        }

	 public boolean isempty ()
		  {
		    if (index == 0)
		    {
		      System.out.println("Der Stack ist leer ...");
		      return true; 
		    }
		    return false;
		  }
        
        
        public void push (int elem)
        {

        	  if(index == 100)
        		    System.out.println("Der Stack ist leider voll...");
        	  else
        		 {
        		    feld[index] = elem; // Element an freie Stelle schreiben
        		    index++;      // Index erhoehen
        		 }
//                if(feld[index] != 0)
//               	{
//                	throw new IllegalArgumentException("die Stack ist voll");	
//                	// ... Stack ist voll
//                }
//                else
//                {
//                    feld [index]= elem; 
//                    index++ ; 
//                }
        }
        
        public void pop()
        {

//                if(index < 0 )
//                {
//                	throw new IllegalArgumentException("Die Stack ist leer"); 
//                	// ... Stack ist leer
//                }
//                else {
//                	int len = index-1 ; 
//                	int date = feld[len];
//                	feld [len]= 0;
//                	index--;
//      
//                }
                if(index == 0)
                	System.out.println("Vom leeren Stack kann nicht geloescht werden...");
                else
                	index--;    
                  
         // Das Element wird nicht geloescht, 
         //lediglich der Platz im Array wird als frei markiert
        
        }
        public int pop2()
        {
          
          if(index == 0)
          {
            System.out.println("Vom leeren Stack kann nicht geloescht werden...");
            return -1; 
          }
          
          else
          return feld[--index];    // Das Element wird nicht geloescht, lediglich der Platz im Array wird als frei markiert
          // das "geloeschte" Element wird aber zurueckgegeben!
        }
        
        
        public int top()
        {
        	
        	 if(index == 0)
        	    {
        	      System.out.println("Beim leeren Stack kann kein Element angezeigt werden...");
        	      return 0;
        	    }
        	    else
        	    return feld[index-1]; // da Index auf die naechste freie Stelle zeigt, muss der Wert an der Stelle index-1 ausgegeben werden
//                if(index < 0 )
//                {
//                	throw new IllegalArgumentException("Die Stack istr leer ! ");
//                	
//                	// ... Stack ist leer
//                }
//                else
//                {
//                	return feld[index-1];
//                }
		     	
                /*
		     	 *  da Index auf die naechste freie Stelle zeigt,
		     	 *  muss der Wert an der Stelle index-1 ausgegeben werden
		         * 
		         * */
		     
        }
        
		public void show()
        {
			 if(index == 0)
			    {
			      System.out.println("Der Stack ist leer. ");
			      
			    }
//			  else
//			    for (int k=index-1; k >= 0; k--)
//			    	System.out.println(feld[k]);
			   
		  for(int i = 0 ; i <= index -1 ; i++)
			{
				int date= feld[i]; 
				
				   System.out.println(date+" ");
			}
			
			//System.out.println();
			
			
//			for(int date : feld)
//			{
//				
//					System.out.print(date+" ");
//			}
			
			
        }
        
        
        public static void main(String args[])
        {
                myStack stack = new myStack();
                
                boolean doneFlag = false;
                
                while(!doneFlag)
                {
                	System.out.println("\nBitte waehlen Sie...");
                	System.out.println("1 Zahl auf Stack ablegen");
                	System.out.println("2 obersten Wert lesen");
                	System.out.println("3 Zahl von Stack loeschen");
                	System.out.println("4 Kompletten Stack anzeigen");
                	System.out.println("jede andere Eingabe beendet das Programm\n");
                	
                	int i = TastaturEingabe.readInt("Bitte Zahl eingeben: ");
                	
                    switch(i)
                    {
                      case 1:
                      {
                        i = TastaturEingabe.readInt("Bitte Stack-Wert eingeben:");
                        stack.push(i);
                        break;
                      }
                      case 2:
                      {
                        if (!stack.isempty()) 
                        System.out.println("Die oberste Zahl ist: " + stack.top());
                        break;
                      }
                      case 3:
                      {
                        if (!stack.isempty())
                        {
                          System.out.println("Die oberste Zahl " + stack.pop2()+ " wird geloescht.");
                          //stack.pop();
                        }
                        
                        break;
                      }
                      case 4:
                      {
                        if (!stack.isempty())
                        {
                          System.out.println("gesamter Stackinhalt: ");
                          stack.show();
                        }
                        
                        break;
                      }
                      default:
                      {
                        doneFlag = true;
                      }
                    }
                }
               
        }
}
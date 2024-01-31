package Namen;

import java.util.ArrayList; 

public class Namen
{

    public ArrayList<String> names  ;
    
    public Namen() {
        names=new ArrayList<>();
    }
    
    public void addName(String name) 
    {
        names.add(name) ;
    }
    
    public String getName(int pos) {
        return names.get(pos);
    }
    public void show ()
    { 
        for ( String name : names) {
            System.out.println(name);
        }
    }
    
    public static void main(String[] args) {
     
        Namen n = new Namen() ; 
        
        
        n.addName("Mahmoud") ; 
        n.addName("Ahmad") ; 
        n.addName("Anas") ; 
        
        System.out.println(n.getName(1));
        n.show();
        
    }
}

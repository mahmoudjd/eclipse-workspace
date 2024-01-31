package uebung11;

public class HT
{
  public static void main(String[] args)
  {
    HashTable table = new HashTable(7);
    Data data;
    
    data = new Data(7);
    table.insert(data);
    table.dumpTable();
    
    data = new Data(14);
    table.insert(data);
    table.dumpTable();
    
    table.delete(21);
    table.dumpTable();
    
    data = new Data(28);
    table.insert(data);
    table.dumpTable();
    
    table.isMember(28);
    table.dumpTable();
    
    
    data = new Data(42);
    table.insert(data);
    table.dumpTable();
    
    
    data = new Data(49);
    table.insert(data);
    table.dumpTable();
    
    data = new Data(60);
    table.insert(data);
    table.dumpTable();
    
    data = new Data(80);
    table.insert(data);
    table.dumpTable();
    
    data = new Data(90);
    table.insert(data);
    table.dumpTable();
    
    
  }
}




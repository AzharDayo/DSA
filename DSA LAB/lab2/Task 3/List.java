import javax.print.DocFlavor.STRING;

public interface List {
    
    public boolean isEmpty(); 
    
 
    public int size(); 
   
    public void add(String item); 
   
 
    public void add(int index, String item); 
  
    public void remove(int index); 

    public void remove(String item); 
 
    
    public Linked_ListOf3 duplicate(); 
   
    public Linked_ListOf3 duplicateReversed(); 
   
}
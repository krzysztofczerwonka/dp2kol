import java.util.ArrayList;

//Composite
public class Node implements Component {
	
    private ArrayList<Component> children = new ArrayList<Component>();
    
    public Node() { }

    public void add(Component c) {
        children.add(c);
    }

    public void traverse() { 
    	System.out.println("Node ");
        children.forEach(c -> c.traverse());      
    }
    
    public void zmien(String key, double newValue) {
    	
    	children.forEach(c -> zmien(key, newValue));    
    	
    }
    
    public void cofnij(String key) {
    	
    	children.forEach(c -> c.cofnij(key));
    	
    }
    
}
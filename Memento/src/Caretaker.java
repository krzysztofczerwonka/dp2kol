import java.util.ArrayList;

public class Caretaker {
	
	private ArrayList<Memento> mementos = new ArrayList<>();
	
	public void addMemento (Memento m) {
		mementos.add(m);
	}
	
	public Memento getMemento(int ind) {
		if (ind >= mementos.size() ) {
			return mementos.get(0);
		}
		return mementos.get(ind);
	}

}

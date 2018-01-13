public class Leaf implements Component{

	public String key;
	public double value;
	private Memento memento;

	public Leaf(String key, double value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public void traverse() {
		System.out.println("Leaf [key=" + key + ", value=" + value + "]");
		
	}

	@Override
	public void zmien(String key, double val) {
		if (this.key.equals(key)) {
			memento = new Memento(value);
			this.value = val;
		}	
	}

	@Override
	public void cofnij(String key) {
		if (this.key.equals(key)) {
			if (memento == null) {
				System.out.println("Brak backupu dla: " + key);
				throw new NullPointerException("Brak backupu!!!");
			}
			System.out.println("Przywracanie dla: " + key);
			this.value = memento.getValue();
		}		
	}
	
}

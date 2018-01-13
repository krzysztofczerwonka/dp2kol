/*
  Zaimplementuj proste drzewo korzystaj¹c ze wzorca kompozyt. Ka¿dy node mo¿e mieæ dowoln¹ liczbê liœci 
  lub kolejnych nodów. Liœæ zawiera klucz typu string (zak³adamy, ¿e jest on unikalny – NIE musimy tego 
  warunku implementowaæ ani sprawdzaæ) oraz jedn¹ wartoœæ rzeczywist¹. Napisz funkcjê main, która zbuduje buduje drzewo.

  Kompozyt ma mieæ metodê zmieñ(), która przyjmuj¹c klucz i wartoœæ, znajdzie i zmieni wartoœæ szukanego liœcia 
  (je¿eli istnieje). Ma równie¿ posiadaæ metodê cofnij, która przyjmuje wartoœæ klucza i ustawia znaleziony liœæ 
  do poprzedniego stanu (zapamiêtujemy tylko ostatni stan liœcia). Do tego celu nale¿y skorzystaæ ze wzorca memento.
 */
public class Demo {

	public static void main(String[] args) {
		Node root = new Node();
		Node n1 = new Node();
		Node n2 = new Node();
		root.add(n1);
		root.add(n2);
		root.add(new Leaf("D", 35.7));
		
		n1.add(new Leaf("A", 13.5));
		n1.add(new Leaf("B", -12.3));
		n2.add(new Leaf("C", 22.7));
		
		root.traverse();
		System.out.println("-----\n");
		
		root.zmien("B", 99.999);
		root.traverse();
		System.out.println("-----\n");
		
		root.cofnij("B");
		root.traverse();
		System.out.println("-----\n");
	}

}

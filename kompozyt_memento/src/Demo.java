/*
  Zaimplementuj proste drzewo korzystaj�c ze wzorca kompozyt. Ka�dy node mo�e mie� dowoln� liczb� li�ci 
  lub kolejnych nod�w. Li�� zawiera klucz typu string (zak�adamy, �e jest on unikalny � NIE musimy tego 
  warunku implementowa� ani sprawdza�) oraz jedn� warto�� rzeczywist�. Napisz funkcj� main, kt�ra zbuduje buduje drzewo.

  Kompozyt ma mie� metod� zmie�(), kt�ra przyjmuj�c klucz i warto��, znajdzie i zmieni warto�� szukanego li�cia 
  (je�eli istnieje). Ma r�wnie� posiada� metod� cofnij, kt�ra przyjmuje warto�� klucza i ustawia znaleziony li�� 
  do poprzedniego stanu (zapami�tujemy tylko ostatni stan li�cia). Do tego celu nale�y skorzysta� ze wzorca memento.
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

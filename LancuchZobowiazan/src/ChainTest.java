import java.util.Random;

/*
 * 2. �a�cuch zobowi�za�

Za��my, �e funkcja algorytm_filtrujacy(string) dzia�a tak, �e losowo przypisuje  
wiadomo�ci jedn� z 3 kategorii : spam, wa�ne, inne.
Napisz program, kt�ry zbuduje �a�cuch zale�no�ci (wzorzec �a�cuch zobowi�za�) oraz zdefiniuje 
napis (mo�e by� sta��). Program po przypisaniu napisowi kategorii (funkcj� algorytm_filtrujacy) 
obs�u�y/zmodyfikuje ten napis, a nast�pnie wy�wietli go na ekranie w funkcji main().
Obs�uga polega na dodaniu do pocz�tku wiadomo�ci tekstu :

Gdy kategoria spam: �UWAGA! TO JEST SPAM�
Gdy kategoria wa�ne: �UWAGA! WA�NA WIADOMO�Ɣ
Ponadto, ka�da z nie-wylosowanych kategorii dodaje na koniec tekstu dodatkowe wiadomo�ci (jak w przyk�adzie).
Implementacja wzorca ma korzysta� z listy jednokierunkowej.

INPUT: �Ala ma kota.�, algorytm_filtrujacy -> �spam�
OUTPUT: UWAGA! TO JEST SPAM. Ala ma kota. To nie jest wa�na wiadomo��. To nie jest wiadomo�� z kategorii inne.

INPUT: �Ala ma kota.�, algorytm_filtrujacy -> �wa�ne�
OUTPUT: UWAGA! WA�NA WIADOMO��. Ala ma kota. To nie jest spam. To nie jest wiadomo�� z kategorii inne.

INPUT: �Ala ma kota.�, algorytm_filtrujacy -> �inne�
OUTPUT: Ala ma kota. To nie jest spam. To nie jest wa�na wiadomo��.

 */

public class ChainTest {

	public static void main(String[] args) {
		
		Wiadomosc w1 = new Spam(MessageType.SPAM, "UWAGA! TO JEST SPAM ", " To nie jest spam.");
		Wiadomosc w2 = new Wazna(MessageType.WAZNE, "UWAGA! WA�NA WIADOMO�� ", " To nie jest wa�na wiadomo��.");
		Wiadomosc w3 = new Inne(MessageType.INNE, "", "  To nie jest wiadomo�� z kategorii inne.");
		w1.ustawKolejnyElement(w2);
		w2.ustawKolejnyElement(w3);
		
		w1.wykonaj("Ala ma kota.", algorytmFiltrujacy());

	}
	
	public static MessageType algorytmFiltrujacy() {
		Random random = new Random();
		int r = random.nextInt(3);
		MessageType messageType = null;
		switch (r) {
		case 0:
			messageType = MessageType.SPAM; 
			break;
		case 1:
			messageType = MessageType.WAZNE;
			break;
		case 2:
			messageType = MessageType.INNE;
			break;
		}
		return messageType;
	}

}

import java.util.Random;

/*
 * 2. £añcuch zobowi¹zañ

Za³ó¿my, ¿e funkcja algorytm_filtrujacy(string) dzia³a tak, ¿e losowo przypisuje  
wiadomoœci jedn¹ z 3 kategorii : spam, wa¿ne, inne.
Napisz program, który zbuduje ³añcuch zale¿noœci (wzorzec ³añcuch zobowi¹zañ) oraz zdefiniuje 
napis (mo¿e byæ sta³¹). Program po przypisaniu napisowi kategorii (funkcj¹ algorytm_filtrujacy) 
obs³u¿y/zmodyfikuje ten napis, a nastêpnie wyœwietli go na ekranie w funkcji main().
Obs³uga polega na dodaniu do pocz¹tku wiadomoœci tekstu :

Gdy kategoria spam: „UWAGA! TO JEST SPAM”
Gdy kategoria wa¿ne: „UWAGA! WA¯NA WIADOMOŒÆ”
Ponadto, ka¿da z nie-wylosowanych kategorii dodaje na koniec tekstu dodatkowe wiadomoœci (jak w przyk³adzie).
Implementacja wzorca ma korzystaæ z listy jednokierunkowej.

INPUT: „Ala ma kota.”, algorytm_filtrujacy -> „spam”
OUTPUT: UWAGA! TO JEST SPAM. Ala ma kota. To nie jest wa¿na wiadomoœæ. To nie jest wiadomoœæ z kategorii inne.

INPUT: „Ala ma kota.”, algorytm_filtrujacy -> „wa¿ne”
OUTPUT: UWAGA! WA¯NA WIADOMOŒÆ. Ala ma kota. To nie jest spam. To nie jest wiadomoœæ z kategorii inne.

INPUT: „Ala ma kota.”, algorytm_filtrujacy -> „inne”
OUTPUT: Ala ma kota. To nie jest spam. To nie jest wa¿na wiadomoœæ.

 */

public class ChainTest {

	public static void main(String[] args) {
		
		Wiadomosc w1 = new Spam(MessageType.SPAM, "UWAGA! TO JEST SPAM ", " To nie jest spam.");
		Wiadomosc w2 = new Wazna(MessageType.WAZNE, "UWAGA! WA¯NA WIADOMOŒÆ ", " To nie jest wa¿na wiadomoœæ.");
		Wiadomosc w3 = new Inne(MessageType.INNE, "", "  To nie jest wiadomoœæ z kategorii inne.");
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

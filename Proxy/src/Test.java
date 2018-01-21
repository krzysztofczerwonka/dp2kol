import java.util.ArrayList;
import java.util.List;

/*
 1. Proxy

	Napisz klas� dane bankowe. Metoda w tej klasie przyjmuje klas� Config, i z wpisanej tam �cie�ki pobiera 
	plik z danymi do vektora napis�w. Pojedynczy wiersze z pliku o formacie "konto(bez spacji) kwota(bez spacji)" 
	jest zamieniany na napis "konto: kwota";.
	W funkcji main wy�wietl zawarto�c wektora.
	
	Zmodyfikuj powy�szy program. Dopisz klas� proxy, kt�ra przed odczytaniem danych, odczyta inny plik 
	z uprawnieniami (�cie�ka w klasie Config) i je�eli login osoby tam istnieje (znowu pole z klasy Config) 
	to odczyta w�a�ciwy plik w przeciwnym wypadku zwr�ci wektor tylko z tekstem "brak uprawnie� dost�pu".
 */

public class Test {

	public static void main(String[] args) {
		DaneBankowe daneBankowe = new DaneBankowe();
		Config config = new Config("daneKont.txt", null, null);
		List<String> dane = daneBankowe.dostepDoKonta(config);
		dane.forEach(System.out::println);
		
		//proxy
		ProxyDaneBankowe proxy = new ProxyDaneBankowe();
		Config config2 = new Config("daneKont.txt", "admin", "logins.txt");
		proxy.dostepDoKonta(config2).forEach(System.out::println);
	}

}

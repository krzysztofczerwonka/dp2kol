import java.util.ArrayList;
import java.util.List;

/*
 1. Proxy

	Napisz klasê dane bankowe. Metoda w tej klasie przyjmuje klasê Config, i z wpisanej tam œcie¿ki pobiera 
	plik z danymi do vektora napisów. Pojedynczy wiersze z pliku o formacie "konto(bez spacji) kwota(bez spacji)" 
	jest zamieniany na napis "konto: kwota";.
	W funkcji main wyœwietl zawartoœc wektora.
	
	Zmodyfikuj powy¿szy program. Dopisz klasê proxy, która przed odczytaniem danych, odczyta inny plik 
	z uprawnieniami (œcie¿ka w klasie Config) i je¿eli login osoby tam istnieje (znowu pole z klasy Config) 
	to odczyta w³aœciwy plik w przeciwnym wypadku zwróci wektor tylko z tekstem "brak uprawnieñ dostêpu".
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

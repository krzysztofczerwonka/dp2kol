import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class ProxyDaneBankowe implements Bank {

	private DaneBankowe _daneBankowe;

	public ProxyDaneBankowe() {
		if (_daneBankowe == null) {
			_daneBankowe = new DaneBankowe();
		}
	}

	@Override
	public List<String> dostepDoKonta(Config c) {
		// proxy
		boolean access = wczytaj(c.sciezkaDoUprawnien, c.login);
		if (access) {
			return _daneBankowe.dostepDoKonta(c);
		}

		return Arrays.asList("Brak uprawnien dostepu");
	}

	private boolean wczytaj(String nazwaPlikuUprawnien, String currentLogin) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(nazwaPlikuUprawnien));
			String linia = null;
			while ((linia = br.readLine()) != null) {
				if (linia.equalsIgnoreCase(currentLogin)) {
					return true;
				}
			}
		} catch (Exception e) {
			System.err.println("Wystapil blad przy wczytywaniu danych");
			e.printStackTrace();
		}
		return false;
	}

}

import java.util.ArrayList;
import java.util.List;

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

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class DaneBankowe implements Bank{

	@Override
	public List<String> dostepDoKonta(Config c) {
		return wczytaj(c.sciezkaDoPliku);
	}
	
	private List<String> wczytaj(String nazwaPliku) {
		List<String> saldaKont = new ArrayList<>();
		try {
	        BufferedReader br = new BufferedReader(new FileReader(nazwaPliku));
	        String linia = null;
	        while ((linia = br.readLine()) != null) {
	            String[] splittedData = linia.split("\\s+");
	            saldaKont.add(splittedData[0] + " : " + splittedData[1]);
	        }
	    } catch (Exception e) {
	        System.err.println("Wystapil blad przy wczytywaniu danych");
	        e.printStackTrace();
	    }
	    System.out.println("Wczytanych kont: " + saldaKont.size());
	    return saldaKont;
	}
	
	
	
}

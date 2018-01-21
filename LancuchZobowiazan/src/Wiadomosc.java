
public abstract class Wiadomosc {

	protected MessageType messageType;
	protected Wiadomosc kolejna;
	protected String poczatekWiadomosci;
	protected String koniecWiadomosci;
		
	public Wiadomosc(MessageType messageType, String poczatekWiadomosci, String koniecWiadomosci) {
		this.messageType = messageType;
		this.poczatekWiadomosci = poczatekWiadomosci;
		this.koniecWiadomosci = koniecWiadomosci;
	}

	public void ustawKolejnyElement(Wiadomosc w) {
		this.kolejna = w;
	}
	
	public abstract void wykonaj(String napis, MessageType messageType);
	
}

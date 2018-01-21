
public class Inne extends Wiadomosc{

	public Inne(MessageType messageType, String poczatekWiadomosci, String koniecWiadomosci) {
		super(messageType, poczatekWiadomosci, koniecWiadomosci);
	}

	@Override
	public void wykonaj(String napis, MessageType messageType) {
		if (this.messageType == messageType) {
			napis = this.poczatekWiadomosci + napis;
		} else {
			napis += this.koniecWiadomosci;
		}

		System.out.println(napis);

	}
	

}

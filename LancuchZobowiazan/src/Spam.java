
public class Spam extends Wiadomosc {

	public Spam(MessageType messageType, String poczatekWiadomosci, String koniecWiadomosci) {
		super(messageType, poczatekWiadomosci, koniecWiadomosci);
	}
	
	@Override
	public void wykonaj(String napis, MessageType messageType) {
		if (this.messageType == messageType) {
			napis = this.poczatekWiadomosci + napis;
		} else {
			napis += this.koniecWiadomosci;
		}

		if (kolejna != null) {
			kolejna.wykonaj(napis, messageType);
		}

	}

}

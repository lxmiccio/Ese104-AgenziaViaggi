package agenziaviaggi;

import java.util.Vector;

public class Pacchetto
{
	private String codice;
	private String descrizione;
	private int postiTotali;
	private Vector<Prenotazione> prenotazioni;
	
	public Pacchetto(String codice, String descrizione, int postiTotali)
	{
		if(codice.length() <= 0 || codice == null)
			if (codice.length() <= 0)
				throw new IllegalArgumentException("Lunghezza del codice deve essere maggiore di 0");
			else
				throw new IllegalArgumentException("Necessario assegnare il codice");
		this.codice = codice;
		if(descrizione.length() <= 0 || descrizione == null)
			if (descrizione.length() <= 0)
				throw new IllegalArgumentException("Lunghezza della descrizione deve essere maggiore di 0");
			else
				throw new IllegalArgumentException("Necessario assegnare la descrizione");
		this.descrizione = descrizione;
		if(postiTotali <= 0)
			throw new IllegalArgumentException("Posti totali deve essere positivo");
		this.postiTotali = postiTotali;
		this.prenotazioni = new Vector<Prenotazione>();
	}

	public void addPrenotazione(Prenotazione p) throws NotEnoughPlacesException
	{
		if(getPostiDisponibili() <= p.getPostiRichiesti())
				throw new NotEnoughPlacesException("Posti insufficienti");
		p.setPacchetto(this);
		this.prenotazioni.add(p);
	}
	
	public String getCodice()
	{
		return codice;
	}

	public String getDescrizione()
	{
		return descrizione;
	}

	public int getPostiDisponibili()
	{
		int postiDisponibili = postiTotali;
		for (Prenotazione prenotazione : prenotazioni)
			postiDisponibili -= prenotazione.getPostiRichiesti();
		return postiDisponibili;
		
		/*
		 * int postiDisponibili = postiTotali;
		 * for (int counter = 0; counter < this.prenotazioni.size(); counter++)
		 * postiDisponibili -= this.prenotazioni.get(counter).getPostiRichiesti();
		 * return postiDisponibili;
		 */
	}

	public int getPostiTotali()
	{
		return postiTotali;
	}

	public Vector<Prenotazione> getPrenotazioni()
	{
		return prenotazioni;
	}

	@Override public String toString()
	{
		return "Pacchetto [codice=" + codice + ", descrizione=" + descrizione
				+ ", postiTotali=" + postiTotali + ", n. prenotazioni="
				+ prenotazioni.size() + "]";
	}
	
	
}
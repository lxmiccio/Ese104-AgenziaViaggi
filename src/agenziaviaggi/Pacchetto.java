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
		this.codice = codice;
		this.descrizione = descrizione;
		this.postiTotali = postiTotali;
		this.prenotazioni = new Vector<Prenotazione>();
	}

	public void addPrenotazione(Prenotazione p)
	{
		try
		{
			if(getPostiDisponibili() <= p.getPostiRichiesti())
				throw new NotEnoughPlacesException("Posti insufficienti");
		}
		catch(NotEnoughPlacesException exception)
		{
			exception.getMessage();
		}
		this.prenotazioni.add(p);
	}
	
	public int getPostiDisponibili()
	{
		int postiDisponibili = this.prenotazioni.size();
		for(int counter = 0; counter <= this.prenotazioni.size(); counter++)
			postiDisponibili -= this.prenotazioni.get(counter).getPostiRichiesti();
		return postiDisponibili;
	}
	
	public Vector<Prenotazione> getPrenotazioni()
	{
		return prenotazioni;
	}

	public String getDescrizione()
	{
		return descrizione;
	}

	public int getPostiTotali()
	{
		return postiTotali;
	}

	public String getCodice()
	{
		return codice;
	}
}
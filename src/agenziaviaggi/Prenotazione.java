package agenziaviaggi;

public class Prenotazione
{
	private String codice;
	private int postiRichiesti;
	private Filiale filiale;
	private Cliente cliente;
	private Pacchetto pacchetto;
	
	public Prenotazione(String codice, int postiRichiesti, Filiale filiale, Cliente cliente)
	{
		if(codice.length() <= 0 || codice == null)
		{
			if (codice.length() <= 0)
				throw new IllegalArgumentException("Lunghezza del codice deve essere maggiore di 0");
			else
				throw new IllegalArgumentException("Necessario assegnare il codice"); 
		}
		this.codice = codice;
		if(postiRichiesti <= 0)
			throw new IllegalArgumentException("Posti richiesti deve essere positivo");
		this.postiRichiesti = postiRichiesti;
		if (filiale == null)
			throw new IllegalArgumentException("Necessario assegnare una filiale");
		this.filiale = filiale;
		if (cliente == null)
			throw new IllegalArgumentException("Necessario assegnare cliente");
		this.cliente = cliente;
	}

	public String getCodice()
	{
		return codice;
	}

	public int getPostiRichiesti()
	{
		return postiRichiesti;
	}

	public Filiale getFiliale()
	{
		return filiale;
	}

	public Cliente getCliente()
	{
		return cliente;
	}

	public void setPacchetto(Pacchetto p)
	{
		this.pacchetto = p;
	}

	public Pacchetto getPacchetto(Pacchetto p)
	{
		return pacchetto;
	}

	@Override public String toString()
	{
		return "Prenotazione [cliente=" + cliente + ", filiale=" + filiale
				+ ", codice=" + codice + ", pacchetto=" + pacchetto
				+ ", puntiRichiesti=" + postiRichiesti + "]";
	}
}
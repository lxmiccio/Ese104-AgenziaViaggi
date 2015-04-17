package agenziaviaggi;

public class Cliente
{
	private String nome;
	private String cognome;
	
	public Cliente(String nome, String cognome)
	{
		if(nome.length() <= 0 || nome == null)
			if (nome.length() <= 0)
				throw new IllegalArgumentException("Lunghezza del nome deve essere maggiore di 0");
			else
				throw new IllegalArgumentException("Necessario assegnare il nome"); 
		this.nome = nome;
		if(cognome.length() <= 0 || cognome == null)
			if (cognome.length() <= 0)
				throw new IllegalArgumentException("Lunghezza del nome deve essere maggiore di 0");
			else
				throw new IllegalArgumentException("Necessario assegnare il nome"); 
		this.cognome = cognome;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public String getCognome()
	{
		return this.cognome;
	}

	@Override public String toString()
	{
		return "Cliente [nome=" + nome + ", cognome=" + cognome + "]";
	}
}
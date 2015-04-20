package agenziaviaggi;

public class Filiale
{
	private int numero;

	public Filiale(int numero)
	{
		if(numero <= 0)
			throw new IllegalArgumentException("Numero deve essere maggiore di 0");
		this.numero = numero;
	}

	public int getNumero()
	{
		return numero;
	}

	@Override public String toString()
	{
		return "Filiale [numero=" + numero + "]";
	}
	
}
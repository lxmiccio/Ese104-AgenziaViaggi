package agenziaviaggi;

public class NotEnoughPlacesException extends Exception
{
	private static final long serialVersionUID = 3562212119956097490L;
	private String message;
 
    public NotEnoughPlacesException(String message)
    {
        super(message);
        this.message = message;
    }

    @Override public String getMessage()
    {
        return this.message;
    }
}
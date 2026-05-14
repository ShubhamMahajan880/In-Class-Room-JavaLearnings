package custom.exceptions.tryingQun;

public class ContactAlreadyExistsException extends Exception{
	ContactAlreadyExistsException(String _message)
	{
		super(_message);
	}
}

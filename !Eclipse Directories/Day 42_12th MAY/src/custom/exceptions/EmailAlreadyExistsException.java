package custom.exceptions;

public class EmailAlreadyExistsException extends Exception {
	EmailAlreadyExistsException(String _message)
	{
		super(_message);
	}
}

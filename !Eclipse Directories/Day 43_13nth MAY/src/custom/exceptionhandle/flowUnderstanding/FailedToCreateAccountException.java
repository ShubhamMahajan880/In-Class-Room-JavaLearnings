package custom.exceptionhandle.flowUnderstanding;

public class FailedToCreateAccountException extends RuntimeException {

	FailedToCreateAccountException(String universalMessage) {
		super(universalMessage);
	}
}

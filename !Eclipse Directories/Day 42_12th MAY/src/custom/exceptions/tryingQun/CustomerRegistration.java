package custom.exceptions.tryingQun;
import java.io.IOException;


public class CustomerRegistration {
	public boolean regsiterCustomer(String _contactNumber) throws ContactAlreadyExistsException, IOException, Exception
	{
		String contactNumber = _contactNumber;



		boolean isContactRegistered = true;
		if(isContactRegistered)
		{
			throw new ContactAlreadyExistsException(" Conatct no. - "+contactNumber+" already registered" );
			// new Person("test");
		}
		return true;
	}

}

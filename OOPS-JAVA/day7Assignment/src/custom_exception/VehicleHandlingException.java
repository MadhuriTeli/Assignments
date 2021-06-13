package custom_exception;
//checked exception extends exception 
public class VehicleHandlingException extends Exception{

	public VehicleHandlingException(String errMessage) {
		super(errMessage);
	}
}

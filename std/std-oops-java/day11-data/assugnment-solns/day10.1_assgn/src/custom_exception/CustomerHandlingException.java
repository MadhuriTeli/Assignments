package custom_exception;

@SuppressWarnings("serial")
public class CustomerHandlingException extends Exception {
	public CustomerHandlingException(String detailMesg) {
		super(detailMesg);//invoking super cls constr to init err mesg
	}

}

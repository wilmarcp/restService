package co.com.blogspot.wilmarcp.exception;

public class NegativeNumberNotPermitException extends Exception{

	private static final long serialVersionUID = 1L;

	public NegativeNumberNotPermitException(String message){
		super(message);
	}
}
package flow.exception;

public class FlowException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3270798962048842482L;
	
	public FlowException(){}
	
	public FlowException(String message){
		super(message);
	}
	
	public FlowException(Throwable cause){
		super(cause);
	}
	
	public FlowException(String message, Throwable cause){
		super(message, cause);
	}

}

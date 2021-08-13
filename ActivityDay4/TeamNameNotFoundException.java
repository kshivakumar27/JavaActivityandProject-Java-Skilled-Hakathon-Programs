package Activity1;


class TeamNameNotFoundException extends Exception {

	
	private static final long serialVersionUID = 1L;

	
	public TeamNameNotFoundException() {
		
	}

	public TeamNameNotFoundException(String message) {
		super(message);
		
	}

	
	public TeamNameNotFoundException(Throwable cause) {
		super(cause);
	
	}

	
	public TeamNameNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}


	public TeamNameNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

}
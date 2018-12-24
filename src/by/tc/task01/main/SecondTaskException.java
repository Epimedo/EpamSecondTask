package by.tc.task01.main;

public class SecondTaskException extends Exception {

	public SecondTaskException() {
		super();
	}

	public SecondTaskException(Exception e) {
		super(e);
	}

	public SecondTaskException(String message) {
		super(message);
	}

	public SecondTaskException(String message, Exception e) {
		super(message, e);
	}
}

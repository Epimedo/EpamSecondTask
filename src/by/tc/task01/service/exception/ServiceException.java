package by.tc.task01.service.exception;

import by.tc.task01.main.SecondTaskException;

public class ServiceException extends SecondTaskException {

	public ServiceException() {
		super();
	}

	public ServiceException(Exception e) {
		super(e);
	}

	public ServiceException(String message, Exception e) {
		super(message, e);
	}

	public ServiceException(String message) {
		super(message);
	}

}

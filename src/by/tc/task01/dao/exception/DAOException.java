package by.tc.task01.dao.exception;

import by.tc.task01.main.SecondTaskException;

public class DAOException extends SecondTaskException {

	public DAOException() {
		super();
	}

	public DAOException(String message) {
		super(message);
	}

	public DAOException(Exception e) {
		super(e);
	}

	public DAOException(String message, Exception e) {
		super(message, e);
	}
}

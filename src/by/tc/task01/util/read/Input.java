package by.tc.task01.util.read;

import by.tc.task01.dao.exception.DAOException;

public interface Input {

	public String[] read(String str) throws DAOException;
}

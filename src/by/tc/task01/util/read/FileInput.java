package by.tc.task01.util.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.tc.task01.dao.exception.DAOException;

public class FileInput implements Input {
	private String fileName = "resources/appliances_db.txt";
	private final char paramDelimeter = ' ';

	@Override
	public String[] read(String pattern) throws DAOException {
		String str = null;
		StringBuilder sb = new StringBuilder();
		Pattern pat = Pattern.compile("^" + pattern + " :.+");

		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

			while ((str = reader.readLine()) != null) {
				if (pat.matcher(str).matches()) {
					sb.append(str.substring(str.indexOf(paramDelimeter) + 1, str.length())).append("\n");
				}
			}

		} catch (IOException e) {
			throw new DAOException(e);
		}
		sb.toString().split("\n");

		return sb.toString().split("\n");
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}

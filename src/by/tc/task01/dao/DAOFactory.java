package by.tc.task01.dao;

import by.tc.task01.dao.impl.ApplianceDAOImpl;
import by.tc.task01.dao.util.StringApplianceParse;
import by.tc.task01.dao.util.StringParse;

public final class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();
	private final StringParse parse = new StringApplianceParse();

	private DAOFactory() {
	}

	public ApplianceDAO getApplianceDAO() {
		return applianceDAO;
	}

	public static DAOFactory getInstance() {
		return instance;
	}

	public StringParse getParse() {
		return parse;
	}
}

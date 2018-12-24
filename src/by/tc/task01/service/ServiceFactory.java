package by.tc.task01.service;

import by.tc.task01.service.impl.ApplianceServiceImpl;

public final class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();

	private ServiceFactory() {
	}

	public ApplianceService getApplianceService() {

		return new ApplianceServiceImpl();
	}

	public static ServiceFactory getInstance() {
		return instance;
	}

}

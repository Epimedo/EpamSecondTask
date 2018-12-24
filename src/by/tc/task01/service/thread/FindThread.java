package by.tc.task01.service.thread;

import org.apache.log4j.Logger;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.main.PrintApplianceInfo;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;
import by.tc.task01.service.exception.ServiceException;

public class FindThread<E> extends Thread {
	private Logger LOG = Logger.getLogger(FindThread.class);
	private Criteria<E> criteria;
	private Appliance[] appliance;

	public FindThread(Criteria<E> criteria) {
		this.criteria = criteria;
	}

	@Override
	public void run() {
		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		try {
			appliance = service.find(criteria);
		} catch (ServiceException e) {
			LOG.error(e.getMessage());
		}

		PrintApplianceInfo.print(appliance);
	}

}

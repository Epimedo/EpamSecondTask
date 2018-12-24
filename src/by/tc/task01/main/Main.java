package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import org.apache.log4j.Logger;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;
import by.tc.task01.service.exception.ServiceException;
import by.tc.task01.service.thread.FindThread;

public class Main {
	public static final Logger LOG = Logger.getLogger(Main.class);

	public static void main(String[] args) {

		Criteria<Oven> criteriaOven = new Criteria<Oven>(Oven.class);
		criteriaOven.add(Oven.CAPACITY, 33);

		FindThread<Oven> ovenThread = new FindThread<>(criteriaOven);

		ovenThread.start();

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria<Oven>(Oven.class);
		criteriaOven.add(Oven.HEIGHT, 45.5);
		criteriaOven.add(Oven.DEPTH, 60);

		ovenThread = new FindThread<>(criteriaOven);

		ovenThread.start();

		//////////////////////////////////////////////////////////////////

		Criteria<TabletPC> criteriaTabletPC = new Criteria<TabletPC>(TabletPC.class);
		criteriaTabletPC.add(TabletPC.COLOR, "blue");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 8000);

		FindThread<TabletPC> tabletPCThread = new FindThread<>(criteriaTabletPC);

		tabletPCThread.start();

		//////////////////////////////////////////////////////////////////

		Criteria<Speakers> criteriaSpeakers = new Criteria<>(Speakers.class);
		criteriaSpeakers.add(Speakers.FREQUENCY_RANGE, "2-4");

		FindThread<Speakers> speakersThread = new FindThread<>(criteriaSpeakers);

		speakersThread.start();

		//////////////////////////////////////////////////////////////////

		Criteria<VacuumCleaner> criteriaVacuumCleaner = new Criteria<>(VacuumCleaner.class);
		criteriaVacuumCleaner.add(VacuumCleaner.BAG_TYPE, "XX00");

		FindThread<VacuumCleaner> vacuumCleanerThread = new FindThread<>(criteriaVacuumCleaner);

		vacuumCleanerThread.start();

		//////////////////////////////////////////////////////////////////

		Criteria<Refrigerator> criteriaRefrigerator = new Criteria<>(Refrigerator.class);
		criteriaRefrigerator.add(Refrigerator.OVERALL_CAPACITY, 300);
		criteriaRefrigerator.add(Refrigerator.HEIGHT, 180);

		FindThread<Refrigerator> refrigeratorThread = new FindThread<>(criteriaRefrigerator);

		refrigeratorThread.start();

		//////////////////////////////////////////////////////////////////

		Criteria<Laptop> criteriaLaptop = new Criteria<>(Laptop.class);

		FindThread<Laptop> laptopThread = new FindThread<>(criteriaLaptop);

		laptopThread.start();
	}

}

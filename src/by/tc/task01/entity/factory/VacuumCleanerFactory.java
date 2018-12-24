package by.tc.task01.entity.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

public class VacuumCleanerFactory extends ApplianceFactory {

	@Override
	public Appliance createAppliance() {
		return new VacuumCleaner();
	}

}

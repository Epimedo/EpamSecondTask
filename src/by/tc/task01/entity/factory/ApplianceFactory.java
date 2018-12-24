package by.tc.task01.entity.factory;

import by.tc.task01.entity.Appliance;

public abstract class ApplianceFactory {

	public Appliance getAppliance() {
		return createAppliance();
	}

	abstract public Appliance createAppliance();
}

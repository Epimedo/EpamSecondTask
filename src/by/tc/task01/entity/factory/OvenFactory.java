package by.tc.task01.entity.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

public class OvenFactory extends ApplianceFactory {

	@Override
	public Appliance createAppliance() {
		return new Oven();
	}

}

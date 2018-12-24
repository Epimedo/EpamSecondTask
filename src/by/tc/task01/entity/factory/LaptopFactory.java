package by.tc.task01.entity.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

public class LaptopFactory extends ApplianceFactory {

	@Override
	public Appliance createAppliance() {
		return new Laptop();
	}

}

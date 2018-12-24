package by.tc.task01.entity.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

public class TabletPCFactory extends ApplianceFactory {

	@Override
	public Appliance createAppliance() {
		return new TabletPC();
	}

}

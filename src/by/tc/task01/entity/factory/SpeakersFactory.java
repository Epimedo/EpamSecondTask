package by.tc.task01.entity.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

public class SpeakersFactory extends ApplianceFactory {

	@Override
	public Appliance createAppliance() {
		return new Speakers();
	}

}

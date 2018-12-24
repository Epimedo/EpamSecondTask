package by.tc.task01.entity.building;

import java.util.regex.Pattern;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.SearchCriteria.Oven;
import by.tc.task01.entity.factory.OvenFactory;

public class OvenBuilder extends ApplianceBuilder {

	{
		factory = new OvenFactory();
	}

	@Override
	public Appliance build(String line) {
		Appliance appliance = factory.createAppliance();
		String value = null;

		by.tc.task01.entity.Oven oven = (by.tc.task01.entity.Oven) appliance;
		for (String str : line.split("(,|;|:)")) {
			value = str.substring(str.indexOf(paramDelimeter) + 1, str.length());

			if (Pattern.matches("^.*" + Oven.POWER_CONSUMPTION + ".*$", str)) {
				oven.setPowerConsumption(Integer.parseInt(value));
			} else if (Pattern.matches("^.*" + Oven.CAPACITY + ".*$", str)) {
				oven.setCapacity(Integer.parseInt(value));
			} else if (Pattern.matches("^.*" + Oven.WEIGHT + ".*$", str)) {
				oven.setWeight(Double.parseDouble(value));
			} else if (Pattern.matches("^.*" + Oven.DEPTH + ".*$", str)) {
				oven.setDepth(Double.parseDouble(value));
			} else if (Pattern.matches("^.*" + Oven.HEIGHT + ".*$", str)) {
				oven.setHeight(Double.parseDouble(value));
			} else if (Pattern.matches("^.*" + Oven.WIDTH + ".*$", str)) {
				oven.setWidth(Double.parseDouble(value));
			}

		}

		return oven;
	}

}

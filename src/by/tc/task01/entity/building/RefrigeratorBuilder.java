package by.tc.task01.entity.building;

import java.util.regex.Pattern;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.SearchCriteria.Refrigerator;
import by.tc.task01.entity.factory.RefrigeratorFactory;

public class RefrigeratorBuilder extends ApplianceBuilder {

	{
		factory = new RefrigeratorFactory();
	}

	@Override
	public Appliance build(String line) {
		Appliance appliance = factory.createAppliance();
		String value = null;

		by.tc.task01.entity.Refrigerator refrigerator = (by.tc.task01.entity.Refrigerator) appliance;

		for (String str : line.split("(,|;|:)")) {
			value = str.substring(str.indexOf(paramDelimeter) + 1, str.length());

			if (Pattern.matches("^.*" + Refrigerator.POWER_CONSUMPTION + ".*$", str)) {
				refrigerator.setPowerConsumption(Integer.parseInt(value));
			} else if (Pattern.matches("^.*" + Refrigerator.WEIGHT + ".*$", str)) {
				refrigerator.setWeight(Double.parseDouble(value));
			} else if (Pattern.matches("^.*" + Refrigerator.FREEZER_CAPACITY + ".*$", str)) {
				refrigerator.setFreezerCapacity(Integer.parseInt(value));
			} else if (Pattern.matches("^.*" + Refrigerator.OVERALL_CAPACITY + ".*$", str)) {
				refrigerator.setOverallCapacity(Double.parseDouble(value));
			} else if (Pattern.matches("^.*" + Refrigerator.HEIGHT + ".*$", str)) {
				refrigerator.setHeight(Double.parseDouble(value));
			} else if (Pattern.matches("^.*" + Refrigerator.WIDTH + ".*$", str)) {
				refrigerator.setWidth(Double.parseDouble(value));
			}

		}

		return refrigerator;
	}

}

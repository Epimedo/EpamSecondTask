package by.tc.task01.entity.building;

import java.util.regex.Pattern;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.SearchCriteria.Oven;
import by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner;
import by.tc.task01.entity.factory.VacuumCleanerFactory;

public class VacuumCleanerBuilder extends ApplianceBuilder {

	{
		factory = new VacuumCleanerFactory();
	}

	@Override
	public Appliance build(String line) {
		Appliance appliance = factory.createAppliance();
		String value = null;

		by.tc.task01.entity.VacuumCleaner vacuumCleaner = (by.tc.task01.entity.VacuumCleaner) appliance;

		for (String str : line.split("(,|;|:)")) {
			value = str.substring(str.indexOf(paramDelimeter) + 1, str.length());

			if (Pattern.matches("^.*" + VacuumCleaner.POWER_CONSUMPTION + ".*$", str)) {
				vacuumCleaner.setPowerConsumption(Integer.parseInt(value));
			} else if (Pattern.matches("^.*" + VacuumCleaner.FILTER_TYPE + ".*$", str)) {
				vacuumCleaner.setFilterType(value);
			} else if (Pattern.matches("^.*" + VacuumCleaner.BAG_TYPE + ".*$", str)) {
				vacuumCleaner.setBagType(value);
			} else if (Pattern.matches("^.*" + VacuumCleaner.WAND_TYPE + ".*$", str)) {
				vacuumCleaner.setWandType(value);
			} else if (Pattern.matches("^.*" + VacuumCleaner.MOTOR_SPEED_REGULATION + ".*$", str)) {
				vacuumCleaner.setMotoSpeedRegulation(Integer.parseInt(value));
			} else if (Pattern.matches("^.*" + VacuumCleaner.CLEANING_WIDTH + ".*$", str)) {
				vacuumCleaner.setCleaningWidth(Integer.parseInt(value));
			}

		}

		return vacuumCleaner;
	}

}

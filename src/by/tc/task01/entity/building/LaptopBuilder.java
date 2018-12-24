package by.tc.task01.entity.building;

import java.util.regex.Pattern;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.SearchCriteria.Laptop;
import by.tc.task01.entity.factory.LaptopFactory;

public class LaptopBuilder extends ApplianceBuilder{

	{
		factory = new LaptopFactory();
	}
	
	@Override
	public Appliance build(String line) {
		Appliance appliance = factory.createAppliance();
		String value = null;

		by.tc.task01.entity.Laptop laptop = (by.tc.task01.entity.Laptop) appliance;
		
		for (String str : line.split("(,|;|:)")) {
			value = str.substring(str.indexOf(paramDelimeter) + 1, str.length());

			if (Pattern.matches("^.*" + Laptop.BATTERY_CAPACITY + ".*$", str)) {
				laptop.setBataryCapacity(Double.parseDouble(value));
			} else if (Pattern.matches("^.*" + Laptop.OS + ".*$", str)) {
				laptop.setOs(value);
			} else if (Pattern.matches("^.*" + Laptop.MEMORY_ROM + ".*$", str)) {
				laptop.setMemoryRom(Integer.parseInt(value));
			} else if (Pattern.matches("^.*" + Laptop.SYSTEM_MEMORY + ".*$", str)) {
				laptop.setSystemMemory(Double.parseDouble(value));
			} else if (Pattern.matches("^.*" + Laptop.CPU + ".*$", str)) {
				laptop.setCpu(Double.parseDouble(value));
			} else if (Pattern.matches("^.*" + Laptop.DISPLAY_INCHS + ".*$", str)) {
				laptop.setDisplayInchs(Double.parseDouble(value));
			}

		}

		return laptop;
	}

}

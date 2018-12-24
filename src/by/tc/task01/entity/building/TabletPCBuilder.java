package by.tc.task01.entity.building;

import java.util.regex.Pattern;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.SearchCriteria.TabletPC;
import by.tc.task01.entity.factory.TabletPCFactory;

public class TabletPCBuilder extends ApplianceBuilder {

	{
		factory = new TabletPCFactory();
	}

	@Override
	public Appliance build(String line) {
		Appliance appliance = factory.createAppliance();
		String value = null;

		by.tc.task01.entity.TabletPC tabletPc = (by.tc.task01.entity.TabletPC) appliance;

		for (String str : line.split("(,|;|:)")) {
			value = str.substring(str.indexOf(paramDelimeter) + 1, str.length());

			if (Pattern.matches("^.*" + TabletPC.BATTERY_CAPACITY + ".*$", str)) {
				tabletPc.setBataryCapacity(Integer.parseInt(value));
			} else if (Pattern.matches("^.*" + TabletPC.DISPLAY_INCHES + ".*$", str)) {
				tabletPc.setDisplayInchs(Double.parseDouble(value));
			} else if (Pattern.matches("^.*" + TabletPC.MEMORY_ROM + ".*$", str)) {
				tabletPc.setMemoryRom(Integer.parseInt(value));
			} else if (Pattern.matches("^.*" + TabletPC.FLASH_MEMORY_CAPACITY + ".*$", str)) {
				tabletPc.setFlashMemoryCapacity(Integer.parseInt(value));
			} else if (Pattern.matches("^.*" + TabletPC.COLOR + ".*$", str)) {
				tabletPc.setColor(value.trim());
			}

		}

		return tabletPc;
	}

}

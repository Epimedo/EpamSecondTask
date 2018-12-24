package by.tc.task01.entity.building;

import java.util.regex.Pattern;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.SearchCriteria.Oven;
import by.tc.task01.entity.criteria.SearchCriteria.Speakers;
import by.tc.task01.entity.factory.SpeakersFactory;

public class SpeakersBuilder extends ApplianceBuilder {

	{
		factory = new SpeakersFactory();
	}

	@Override
	public Appliance build(String line) {
		Appliance appliance = factory.createAppliance();
		String value = null;

		by.tc.task01.entity.Speakers oven = (by.tc.task01.entity.Speakers) appliance;

		for (String str : line.split("(,|;|:)")) {
			value = str.substring(str.indexOf(paramDelimeter) + 1, str.length());

			if (Pattern.matches("^.*" + Speakers.POWER_CONSUMPTION + ".*$", str)) {
				oven.setPowerConsumption(Integer.parseInt(value));
			} else if (Pattern.matches("^.*" + Speakers.NUMBER_OF_SPEAKERS + ".*$", str)) {
				oven.setNumberOfSpeakers(Integer.parseInt(value));
			} else if (Pattern.matches("^.*" + Speakers.FREQUENCY_RANGE + ".*$", str)) {
				oven.setFrequencyRange(value);
			} else if (Pattern.matches("^.*" + Speakers.CORD_LENGTH + ".*$", str)) {
				oven.setCordLength(Integer.parseInt(value));
			}

		}

		return oven;
	}

}

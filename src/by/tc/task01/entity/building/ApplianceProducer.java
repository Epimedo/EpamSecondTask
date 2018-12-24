package by.tc.task01.entity.building;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import java.util.HashMap;
import java.util.Map;

import by.tc.task01.entity.Appliance;

public class ApplianceProducer {
	ApplianceBuilder builder;
	Appliance[] apps;
	Map<String, ApplianceBuilder> map = new HashMap<>();
	{
		map.put(Oven.class.getSimpleName(), new OvenBuilder());
		map.put(Laptop.class.getSimpleName(), new LaptopBuilder());
		map.put(Refrigerator.class.getSimpleName(), new RefrigeratorBuilder());
		map.put(Speakers.class.getSimpleName(), new SpeakersBuilder());
		map.put(TabletPC.class.getSimpleName(), new TabletPCBuilder());
		map.put(VacuumCleaner.class.getSimpleName(), new VacuumCleanerBuilder());
	}
	
	public void prepare(String builderName) {
		builder = map.get(builderName);
	}
	
	public Appliance[] produce(String[] lines) {
		apps = new Appliance[lines.length];

		for (int i = 0; i < lines.length; i++) {
			apps[i] = builder.build(lines[i]);
		}
		return apps;
	}

}

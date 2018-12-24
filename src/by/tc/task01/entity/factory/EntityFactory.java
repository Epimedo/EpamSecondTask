package by.tc.task01.entity.factory;

import by.tc.task01.entity.building.ApplianceProducer;

public class EntityFactory {
	private static final EntityFactory instance = new EntityFactory();

	private EntityFactory() {
	}

	public static EntityFactory getInstance() {
		return instance;
	}

	public ApplianceProducer getProducer() {
		return new ApplianceProducer();
	}
}

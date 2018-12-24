package by.tc.task01.entity.building;

import java.util.regex.Pattern;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.factory.ApplianceFactory;

public abstract class ApplianceBuilder {
	protected ApplianceFactory factory;
	protected final char paramDelimeter = '=';

	abstract public Appliance build(String str);
}

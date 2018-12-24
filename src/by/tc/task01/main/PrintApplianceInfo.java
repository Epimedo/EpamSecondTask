package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {

	public synchronized static void print(Appliance[] appliance) {
		for (Appliance app : appliance) {
			System.out.println(app.toString() + "\n");
		}

	}

}

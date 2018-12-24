package by.tc.task01.entity;

public abstract class HouseholdAppliance extends Appliance {
	private int powerConsumption;

	public HouseholdAppliance() {
		super();
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	@Override
	public String toString() {
		return super.toString() + "\nHouseholdAppliance [POWER_CONSUMPTION=" + powerConsumption + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + powerConsumption;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj.getClass() == this.getClass())) {
			return false;
		}

		HouseholdAppliance other = (HouseholdAppliance) obj;
		boolean bool = false;

		if (powerConsumption == other.powerConsumption) {
			bool = true;
		}

		return bool;
	}

}

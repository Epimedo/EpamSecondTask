package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.SearchCriteria.Laptop;

public class LaptopCriteriaSelect implements ValidatorCriteriaSelect {

	@Override
	public Object[] select() {
		return Laptop.values();
	}

}

package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.SearchCriteria.Oven;

public class OvenCriteriaSelect implements ValidatorCriteriaSelect {

	@Override
	public Object[] select() {
		return Oven.values();
	}

}

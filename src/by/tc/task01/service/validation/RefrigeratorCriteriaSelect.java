package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.SearchCriteria.Refrigerator;

public class RefrigeratorCriteriaSelect implements ValidatorCriteriaSelect {

	@Override
	public Object[] select() {
		return Refrigerator.values();
	}

}

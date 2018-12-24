package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner;

public class VacuumCleanerCriteriaSelect implements ValidatorCriteriaSelect {

	@Override
	public Object[] select() {
		return VacuumCleaner.values();
	}

}

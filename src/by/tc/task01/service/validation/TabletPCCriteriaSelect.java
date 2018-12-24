package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.SearchCriteria.TabletPC;

public class TabletPCCriteriaSelect implements ValidatorCriteriaSelect {

	@Override
	public Object[] select() {
		return TabletPC.values();
	}

}

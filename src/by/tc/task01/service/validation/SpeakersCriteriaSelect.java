package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.SearchCriteria.Speakers;

public class SpeakersCriteriaSelect implements ValidatorCriteriaSelect {

	@Override
	public Object[] select() {
		return Speakers.values();
	}

}

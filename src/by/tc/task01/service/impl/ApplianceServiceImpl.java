package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.dao.exception.DAOException;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.exception.ServiceException;
import by.tc.task01.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService {

	@Override
	public <E> Appliance[] find(Criteria<E> criteria) throws ServiceException {
		if (!Validator.criteriaValidator(criteria)) {
			throw new ServiceException("Incorrect criteria");
		}

		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		Appliance[] appliance;
		try {
			appliance = applianceDAO.find(criteria);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}

		return appliance;
	}

}

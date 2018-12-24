package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.exception.DAOException;
import by.tc.task01.dao.util.StringApplianceParse;
import by.tc.task01.dao.util.StringParse;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.building.ApplianceProducer;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.factory.EntityFactory;
import by.tc.task01.util.factory.FileInputFactory;
import by.tc.task01.util.factory.InputFactory;
import by.tc.task01.util.read.Input;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public <E> Appliance[] find(Criteria<E> criteria) throws DAOException {
		InputFactory inFactory = new FileInputFactory();
		Input in = inFactory.createInput();
		String[] inputStr = in.read(criteria.getTypeNameGenerics());

		StringParse parse = new StringApplianceParse();

		inputStr = parse.parse(inputStr, criteria);

		EntityFactory entityFact = EntityFactory.getInstance();
		ApplianceProducer producer = entityFact.getProducer();

		producer.prepare(criteria.getTypeNameGenerics());

		return producer.produce(inputStr);
	}

}

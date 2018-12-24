package by.tc.task01.dao.util;

import by.tc.task01.entity.criteria.Criteria;

public interface StringParse {

	public <E> String[] parse(String[] lines, Criteria<E> criteria);
}

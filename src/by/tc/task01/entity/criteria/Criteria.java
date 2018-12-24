package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {
	private Class<E> eClass;
	private Map<E, Object> criteria = new HashMap<E, Object>();

	public Criteria(Class<E> type) {
		eClass = type;
	}

	public String getTypeNameGenerics() {
		return eClass.getSimpleName();
	}
	
	

	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public Map<E, Object> getCriteria() {
		return criteria;
	}

	public void setCriteria(Map<E, Object> criteria) {
		this.criteria = criteria;
	}

}

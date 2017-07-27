package com.bagcity.util;

import java.util.List;

public interface BaseService<PK, E> {
	E  find(E var1);
	E  findById(PK var1);
	List<E> findAll();
	E save(E var1);
	void delete(PK var1);
}

package com.example.daoImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.dao.RequestDao;
import com.example.domain.RequestDomain;

@Repository
@Transactional
public class RequestDaoImpl implements RequestDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void saveRequest(RequestDomain rd) {
		entityManager.persist(rd);
	}

}

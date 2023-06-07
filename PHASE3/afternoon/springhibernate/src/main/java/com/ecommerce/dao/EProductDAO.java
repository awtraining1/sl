package com.ecommerce.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.entity.EProductEntity;

@Repository
public class EProductDAO {
	@Autowired
	private SessionFactory sessionFactory;

	// Business Methods
	@SuppressWarnings("unchecked")
	public List<EProductEntity> getAllProducts() {
		return this.sessionFactory.getCurrentSession().createQuery("from EProductEntity").list();
	}
}
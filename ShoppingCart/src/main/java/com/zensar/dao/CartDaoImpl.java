package com.zensar.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CartDaoImpl  implements CartDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	

	

}

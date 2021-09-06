package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Advertisement;

@Repository
public class AdminDaoImpl implements IAdminDao {

	@Autowired
	private EntityManager mgr;
	@Override
	public List<Advertisement> listAdvertisements() {
		String jpql = "select a from Advertisement a";
		return mgr.createQuery(jpql, Advertisement.class).getResultList();
	}

}

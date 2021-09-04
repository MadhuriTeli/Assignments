package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Tutorial;

@Repository
@Transactional
public class TutorialDaoImpl implements ITutorialDao {
	// depdency
	@Autowired
	private EntityManager mgr;

	@Override
	public List<String> getAllTutorialsByTopic(int topicId) {
		String jpql = "select t.tutorialName from Tutorial t where t.currentTopic.id=:id";
		return mgr.createQuery(jpql, String.class).setParameter("id", topicId).getResultList();
	}

	@Override
	public Tutorial updateVisits(String tutName) {
		// get tutorial details from it's name
		String jpql = "select t from Tutorial t where t.tutorialName=:name";
		Tutorial tutorial = mgr.createQuery(jpql, Tutorial.class).
				setParameter("name", tutName).getSingleResult();
		//=> tut exists : tutorial : PERSISTENT
		tutorial.setVisits(tutorial.getVisits()+1);//updating state of the persistent entity
		return tutorial;
	}

}

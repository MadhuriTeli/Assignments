package com.app.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Player;

@Transactional
@Repository
public class PlayerDaoImpl implements IPlayerDao {
	// dependency
	@Autowired
	private EntityManager manager;

	@Override
	public String admitPlayer( Player s) {
		System.out.println("In player dao imp");
		System.out.println(s);
//		String jpql="Insert into iacsd2.player (player_name,team_name,player_role,against_team_name) "
//				+ "values( :pn,:tn,:pr,:atn)";
//
//				
//  return manager.createQuery(jpql, Player.class)
//		.setParameter("pn", s.getPlayer_name())	
//		.setParameter("tn", s.getTeam_name())	
//		.setParameter("pr", s.getPlayer_role())	
//		.setParameter("atn", s.getAgainst_team_name()).executeUpdate();
//		
		
		
		
//		 manager.createNativeQuery(jpql, Player.class)
//			.setParameter("pn", s.getPlayer_name())	
//			.setParameter("tn", s.getTeam_name())	
//			.setParameter("pr", s.getPlayer_role())	
//			.setParameter("atn", s.getAgainst_team_name())
//			.getSingleResult();
		
		// get Course from course id
//		Course course = manager.find(Course.class, courseId);
//		if (course != null) {
//			s.setSelectedCourse(course);
//			manager.persist(s);
//			return "Student Admitted";
//		}
		//return "Student Admission failed : Invalid Course";
		//manager.persist(s);
		manager.persist(s);
		return "Player added Successfully!";
	}
	
	

}

package com.app.dao;

import java.util.List;

import com.app.pojos.Tutorial;

public interface ITutorialDao {
	List<String> getAllTutorialsByTopic(int topicId);
	Tutorial updateVisits(String tutName);
}

package com.app.pojos;

import javax.persistence.Entity;

@Entity
public class Team extends BaseEntity {
private String teamName;

public String getTeamName() {
	return teamName;
}

public void setTeamName(String teamName) {
	this.teamName = teamName;
}

public Team(String teamName) {
	super();
	this.teamName = teamName;
}
public Team() {
	// TODO Auto-generated constructor stub
}
}

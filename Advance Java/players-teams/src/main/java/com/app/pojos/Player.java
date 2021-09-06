package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity//

public class Player extends BaseEntity{

	@Column(length = 20)
private String playerName;
@ManyToOne
@JoinColumn(name = "team_id")
private Team teamName;
@OneToOne
@JoinColumn(name = "role_id")
private Role playerRole;
private int matchPlayed;

public String getPlayerName() {
	return playerName;
}
public void setPlayerName(String playerName) {
	this.playerName = playerName;
}
public Team getTeamName() {
	return teamName;
}
public void setTeamName(Team teamName) {
	this.teamName = teamName;
}
public Role getPlayerRole() {
	return playerRole;
}
public void setPlayerRole(Role playerRole) {
	this.playerRole = playerRole;
}
public int getMatchPlayed() {
	return matchPlayed;
}
public void setMatchPlayed(int matchPlayed) {
	this.matchPlayed = matchPlayed;
}


}

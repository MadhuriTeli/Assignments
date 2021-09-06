package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
//Map this to existing tables "users"
@Table(name = "players")
public class Player extends BaseEntity{
	
	//(Note: Table will contain fields like player_id , player_name, team_name, player_role (batsman,
	//bowler) (according to role add runs and wickets),match played) 


	@Column(length = 20)  //not needed if mapping to existing table /col
	private String player_name;
	
	@Column(length = 20)
	private String team_name;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 10)
	private PlayerRole player_role;
	
	@Column(length = 20)
	private String against_team_name;
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public String getPlayer_name() {
		return player_name;
	}

	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public PlayerRole getPlayer_role() {
		return player_role;
	}

	public void setPlayer_role(PlayerRole player_role) {
		this.player_role = player_role;
	}

	public String getAgainst_team_name() {
		return against_team_name;
	}

	public void setAgainst_team_name(String against_team_name) {
		this.against_team_name = against_team_name;
	}

	@Override
	public String toString() {
		return "Player [player_name=" + player_name + ", team_name=" + team_name + ", player_role=" + player_role
				+ ", against_team_name=" + against_team_name + "]";
	}

	
	
}

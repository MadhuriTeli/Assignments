package com.app.pojos;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="roles")
public class Role {
	private Integer id;
	private String name;
	@JsonIgnoreProperties("roles")
	private Set<User> users = new HashSet<>();

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@Column(length=20,unique=true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@ManyToMany(mappedBy="roles")
	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
	

	
	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + ((id == null) ? 0 : id.hashCode()); return result;
	 * }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Role other = (Role) obj; if (id == null) { if (other.id != null)
	 * return false; } else if (!id.equals(other.id)) return false; return true; }
	 */
	@Override
	public String toString() {
		return "Role id=" + id + ", name=" + name;
	}

}

package pojos;

import javax.persistence.*;

@MappedSuperclass //to tell hibernate / JPA implementor : no table for this super class
//Tables should be created for sub classes (entities)
public class BaseEntity {
	@Id //mandatory
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	public BaseEntity() {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}

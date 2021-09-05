package pojos;

import java.time.LocalDate;
import javax.persistence.*;

@Embeddable //to specify whatever follows is a Value type(Composite type) : does not have it's own identity
//does not have independent life cycle , depends TOTALLY upon owning entity
public class AdharCard {
	@Column(name="card_no",length = 20,unique = true)
	private String cardNumber;
	@Column(length = 20)
	private String location;
	@Column(name="created_on")
	private LocalDate createdOn;
	
	public AdharCard() {
		// TODO Auto-generated constructor stub
	}
	public AdharCard(String cardNumber, String location, LocalDate createdOn) {
		super();
		this.cardNumber = cardNumber;
		this.location = location;
		this.createdOn = createdOn;
	}
	//all setters n getters
	
	@Override
	public String toString() {
		return "AdharCard [cardNumber=" + cardNumber + ", location=" + location + ", createdOn=" + createdOn + "]";
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public LocalDate getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}
	

}

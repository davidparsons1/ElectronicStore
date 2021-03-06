package entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import com.sun.xml.internal.txw2.annotation.XmlElement;



@Entity
public abstract class Customer  {	
	
	
	String payMethod;
	int loyaltyPoints;
	String shipAddress1;
	String shipAddress2;
	
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	public Customer( ) {

	}
	
	public Customer(  String payMethod, int loyaltyPoints, String shipAddress1, String shipAddress2) {
		super();
		
		
		this.payMethod = payMethod;
		this.loyaltyPoints = loyaltyPoints;
		this.shipAddress1 = shipAddress1;
		this.shipAddress2 = shipAddress2;
	}

	@XmlElement
	public String getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

	@XmlElement
	public int getLoyaltyPoints() {
		return loyaltyPoints;
	}

	public void setLoyaltyPoints(int loyaltyPoints) {
		this.loyaltyPoints = loyaltyPoints;
	}

	@XmlElement
	public String getShipAddress1() {
		return shipAddress1;
	}

	@XmlElement
	public void setShipAddress1(String shipAddress1) {
		this.shipAddress1 = shipAddress1;
	}

	public String getShipAddress2() {
		return shipAddress2;
	}

	public void setShipAddress2(String shipAddress2) {
		this.shipAddress2 = shipAddress2;
	}

	
}


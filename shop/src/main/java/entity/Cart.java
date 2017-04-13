package entity;


import java.util.HashSet;
import java.util.Set;


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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.sun.xml.internal.txw2.annotation.XmlElement;



@Entity
public class Cart {

	String title;
	double price;
	

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	

	public Cart() {

	}

	public Cart( String title,  double price) {
		super();

		this.title = title;
		this.price = price;
	
	}

	@XmlElement
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}

	
	@XmlElement
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}




}

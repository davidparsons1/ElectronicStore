package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import com.sun.xml.internal.txw2.annotation.XmlElement;



@Entity
public abstract class Admin {	
	
	
	boolean administrator;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	public Admin( ) {

	}
	
	public Admin(  boolean administrator) {
		super();
		
		
		this.administrator = administrator;
	}
	

	@XmlElement
	public boolean isAdministrator() {
		return administrator;
	}

	public void setAdministrator(boolean administrator) {
		this.administrator = administrator;
	}
	
	

}


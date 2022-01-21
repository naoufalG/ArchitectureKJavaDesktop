package entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Smartphone
 *
 */
@Entity

public class Smartphone implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String imei;
	@OneToMany
	private List<Position> positions;
	@ManyToOne
	private User user;
	private static final long serialVersionUID = 1L;

	public Smartphone() {
		super();
	}   
	
	
	
	public Smartphone(String imei, List<Position> positions, User user) {
		super();
		this.imei = imei;
		this.positions = positions;
		this.user = user;
	}
	
	public Smartphone(String imei, User user) {
		super();
		this.imei = imei;
		this.user = user;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getImei() {
		return this.imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}
	public List<Position> getPositions() {
		return positions;
	}
	public void setPositions(List<Position> positions) {
		this.positions = positions;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
   
}

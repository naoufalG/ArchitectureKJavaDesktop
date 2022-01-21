package entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Position
 *
 */
@Entity

public class Position implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String latitude;
	private String longitude;
	@Temporal(TemporalType.DATE)
	private Date date;
	@ManyToOne
	private Smartphone smartphone;
	private static final long serialVersionUID = 1L;

	public Position() {
		super();
	}

	public int getId() {
		return this.id;
	}

	public Position(String latitude, String longitude, Date date, Smartphone smartphone) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.date = date;
		this.smartphone = smartphone;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Smartphone getSmartphone() {
		return smartphone;
	}

	public void setSmartphone(Smartphone smartphone) {
		this.smartphone = smartphone;
	}

}

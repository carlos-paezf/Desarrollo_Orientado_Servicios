package com.mysql.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the geographic_location database table.
 * 
 */
@Entity
@Table(name="geographic_location")
public class GeographicLocation implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL = "GeographicLocation.FIND_ALL";
	
	public static final String FIND_ALL_ID= "GeographicLocation.FIND_ALL_ID";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_geographic_location")
	private int idGeographicLocation;

	private int location;

	@Column(name="location_name")
	private String locationName;

	public GeographicLocation() {
	}

	public int getIdGeographicLocation() {
		return this.idGeographicLocation;
	}

	public void setIdGeographicLocation(int idGeographicLocation) {
		this.idGeographicLocation = idGeographicLocation;
	}

	public int getLocation() {
		return this.location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public String getLocationName() {
		return this.locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

}
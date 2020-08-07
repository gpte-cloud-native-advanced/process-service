package com.redhat.cajun.navy.process.rules.model;
import java.io.Serializable;
import java.math.BigDecimal;

public class Responder implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;

	private String fullname;
	
	private String phoneNumber;
	
	private BigDecimal latitude;
	
	private BigDecimal longitude;
	
	private Integer boatCapacity;
	
	private Boolean hasMedical;

	private Boolean person;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public Integer getBoatCapacity() {
		return boatCapacity;
	}

	public void setBoatCapacity(Integer boatCapacity) {
		this.boatCapacity = boatCapacity;
	}

	public Boolean getHasMedical() {
		return hasMedical;
	}

	public void setHasMedical(Boolean hasMedical) {
		this.hasMedical = hasMedical;
	}

	public Boolean getPerson() {
		return person;
	}

	public void setPerson(Boolean person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Responder [id=" + id + ", fullname=" + fullname + ", phoneNumber=" + phoneNumber + ", latitude="
				+ latitude + ", longitude=" + longitude + ", boatCapacity=" + boatCapacity + ", hasMedical="
				+ hasMedical + ", person=" + person + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boatCapacity == null) ? 0 : boatCapacity.hashCode());
		result = prime * result + ((fullname == null) ? 0 : fullname.hashCode());
		result = prime * result + ((hasMedical == null) ? 0 : hasMedical.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
		result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((person == null) ? 0 : person.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Responder other = (Responder) obj;
		if (boatCapacity == null) {
			if (other.boatCapacity != null)
				return false;
		} else if (!boatCapacity.equals(other.boatCapacity))
			return false;
		if (fullname == null) {
			if (other.fullname != null)
				return false;
		} else if (!fullname.equals(other.fullname))
			return false;
		if (hasMedical == null) {
			if (other.hasMedical != null)
				return false;
		} else if (!hasMedical.equals(other.hasMedical))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (latitude == null) {
			if (other.latitude != null)
				return false;
		} else if (!latitude.equals(other.latitude))
			return false;
		if (longitude == null) {
			if (other.longitude != null)
				return false;
		} else if (!longitude.equals(other.longitude))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		return true;
	}
}
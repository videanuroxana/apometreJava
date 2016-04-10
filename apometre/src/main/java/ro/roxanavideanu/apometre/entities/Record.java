package ro.roxanavideanu.apometre.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="records")
public class Record {

	@Id
	private Integer id;
	
	@Column (name="user_id")
	private Integer user_id;
	
	@Column (name="an")
	private Integer an;
	
	@Column (name="luna")
	private Integer luna;
	
	@Column (name="apa_rece")
	private Double apa_rece;
	
	@Column (name="apa_calda")
	private Double apa_calda;
	
	@Column (name="room_id")
	private Integer room_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getAn() {
		return an;
	}

	public void setAn(Integer an) {
		this.an = an;
	}

	public Integer getLuna() {
		return luna;
	}

	public void setLuna(Integer luna) {
		this.luna = luna;
	}

	public Double getApa_rece() {
		return apa_rece;
	}

	public void setApa_rece(Double apa_rece) {
		this.apa_rece = apa_rece;
	}

	public Double getApa_calda() {
		return apa_calda;
	}

	public void setApa_calda(Double apa_calda) {
		this.apa_calda = apa_calda;
	}

	public Integer getRoom_id() {
		return room_id;
	}

	public void setRoom_id(Integer room_id) {
		this.room_id = room_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Record other = (Record) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
}

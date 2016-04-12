package ro.roxanavideanu.apometre.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="records")
public class Record {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column (name="user_id")
	private Integer user_id;
	
	@Column (name="an")
	private Integer an;
	
	@Column (name="luna")
	private Integer luna;
	
	@Column (name="apa_rece")
	private Double apaRece;
	
	@Column (name="apa_calda")
	private Double apaCalda;
	
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

	public Double getApaRece() {
		return apaRece;
	}

	public void setApaRece(Double apaRece) {
		this.apaRece = apaRece;
	}

	public Double getApaCalda() {
		return apaCalda;
	}

	public void setApaCalda(Double apaCalda) {
		this.apaCalda = apaCalda;
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

	@Override
	public String toString() {
		return "Record [id=" + id + ", user_id=" + user_id + ", an=" + an + ", luna=" + luna + ", apa_rece=" + apaRece
				+ ", apa_calda=" + apaCalda + ", room_id=" + room_id + "]";
	}
	
	
	
	
}

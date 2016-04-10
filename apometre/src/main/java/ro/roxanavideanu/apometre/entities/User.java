package ro.roxanavideanu.apometre.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="username",length=255,nullable=false)
	private String username;
	
	@Column(name="password")
	private String password;

	
	@Column (name="nume")
	private String nume;
	
	@Column (name="prenume")
	private String prenume;
	
	@Column (name="mail")
	private String mail;
	
	@Column (name="judet")
	private String judet;
	
	@Column (name="localitate")
	private String localitate;
	
	@Column (name="sector")
	private Integer sector;
	
	@Column (name="bloc")
	private String bloc;
	
	@Column (name="scara")
	private String scara;
	
	@Column (name="etaj")
	private Integer etaj;
	
	@Column (name="apartament")
	private Integer apartament;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getJudet() {
		return judet;
	}

	public void setJudet(String judet) {
		this.judet = judet;
	}

	public String getLocalitate() {
		return localitate;
	}

	public void setLocalitate(String localitate) {
		this.localitate = localitate;
	}

	public Integer getSector() {
		return sector;
	}

	public void setSector(Integer sector) {
		this.sector = sector;
	}

	public String getBloc() {
		return bloc;
	}

	public void setBloc(String bloc) {
		this.bloc = bloc;
	}

	public String getScara() {
		return scara;
	}

	public void setScara(String scara) {
		this.scara = scara;
	}

	public Integer getEtaj() {
		return etaj;
	}

	public void setEtaj(Integer etaj) {
		this.etaj = etaj;
	}

	public Integer getApartament() {
		return apartament;
	}

	public void setApartament(Integer apartament) {
		this.apartament = apartament;
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
		
		
		User other = (User) obj;
		
		if (id == null) {
			if (other.id != null)
				return false;
			
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", nume=" + nume + ", prenume="
				+ prenume + ", mail=" + mail + ", judet=" + judet + ", localitate=" + localitate + ", sector=" + sector
				+ ", bloc=" + bloc + ", scara=" + scara + ", etaj=" + etaj + ", apartament=" + apartament + "]";
	}
	

}

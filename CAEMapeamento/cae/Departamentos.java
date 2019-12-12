package cae;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Departamentos {
	@Id
	private Long id_depart;
	private String cargo;
	
	public Long getId_depart() {
		return id_depart;
	}
	public void setId_depart(Long id_depart) {
		this.id_depart = id_depart;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
package cae;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GerenteCAE {
    @Id
	private Long id_GER;
	private String name;
	private String cpf;
	
	public Long getId_GER() {
		return id_GER;
	}
	public void setId_GER(Long id_GER) {
		this.id_GER = id_GER;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
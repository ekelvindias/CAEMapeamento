package cae;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Func_CAE {
	@Id
	private Long id_Func_cae;
	private String nome_func;
	private String cpf;
	@ManyToOne
	private Set<Departamentos> id_depart;
	private Set<AgenciasCAE> empresa_cae;
	
	public Long getId_Func_cae() {
		return id_Func_cae;
	}
	public void setId_Func_cae(Long id_Func_cae) {
		this.id_Func_cae = id_Func_cae;
	}
	public String getNome_func() {
		return nome_func;
	}
	public void setNome_func(String nome_func) {
		this.nome_func = nome_func;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Set<Departamentos> getId_depart() {
		return id_depart;
	}
	public void setId_depart(Set<Departamentos> id_depart) {
		this.id_depart = id_depart;
	}
	public Set<AgenciasCAE> getEmpresa_cae() {
		return empresa_cae;
	}
	public void setEmpresa_cae(Set<AgenciasCAE> empresa_cae) {
		this.empresa_cae = empresa_cae;
	}
	
}
package cae;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AgenciasCAE {	
	@Id
	private Long id_CAE;
	private String cidade;
	@ManyToOne
	private Set<GerenteCAE> gerente;
	private Set<Func_CAE> Funcionario;
	
	public Long getId_CAE() {
		return id_CAE;
	}
	public void setId_CAE(Long id_CAE) {
		this.id_CAE = id_CAE;
	}
	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Set<Func_CAE> getFuncionario() {
		return Funcionario;
	}
	public void setFuncionario(Set<Func_CAE> funcionario) {
		Funcionario = funcionario;
	}
	
	public Set<GerenteCAE> getGerente() {
		return gerente;
	}
	public void setGerente(Set<GerenteCAE> gerente) {
		this.gerente = gerente;
	}
	
}
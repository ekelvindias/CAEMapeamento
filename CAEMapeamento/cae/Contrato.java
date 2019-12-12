package cae;

import java.sql.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Contrato {
	@Id
	private Long cod_contrato;
	private Date data_inicio;
	private Date data_fim;
	@ManyToOne
	private Set<Clientes> id_Cliente;
	private Set<AgenciasCAE> id_CAE;
	private Set<Planos> cod_planos;

	
	public Long getCod_contrato() {
		return cod_contrato;
	}
	public void setCod_contrato(Long cod_contrato) {
		this.cod_contrato = cod_contrato;
	}
	public Set<Clientes> getId_Cliente() {
		return id_Cliente;
	}
	public void setId_Cliente(Set<Clientes> id_Cliente) {
		this.id_Cliente = id_Cliente;
	}
	public Set<AgenciasCAE> getId_CAE() {
		return id_CAE;
	}
	public void setId_CAE(Set<AgenciasCAE> id_CAE) {
		this.id_CAE = id_CAE;
	}
	public Set<Planos> getCod_planos() {
		return cod_planos;
	}
	public void setCod_planos(Set<Planos> cod_planos) {
		this.cod_planos = cod_planos;
	}
	public Date getData_inicio() {
		return data_inicio;
	}
	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}
	public Date getData_fim() {
		return data_fim;
	}
	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}

}
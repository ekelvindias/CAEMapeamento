package cae;

import java.sql.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Emprestimos {
	private Long cod_emprestimos;
	private Long valor;
	private Long pacelas;
	private Date data_contrato;
	private Date data_pagamento;
	private Long taxa_juros;
	@ManyToOne
	private Set<Clientes> id_Cliente;
	private Set<AgenciasCAE> id_CAE;

	public Long getCod_emprestimos() {
		return cod_emprestimos;
	}
	public void setCod_emprestimos(Long cod_emprestimos) {
		this.cod_emprestimos = cod_emprestimos;
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
	public Long getValor() {
		return valor;
	}
	public void setValor(Long valor) {
		this.valor = valor;
	}
	public Long getPacelas() {
		return pacelas;
	}
	public void setPacelas(Long pacelas) {
		this.pacelas = pacelas;
	}
	public Date getData_contrato() {
		return data_contrato;
	}
	public void setData_contrato(Date data_contrato) {
		this.data_contrato = data_contrato;
	}
	public Date getData_pagamento() {
		return data_pagamento;
	}
	public void setData_pagamento(Date data_pagamento) {
		this.data_pagamento = data_pagamento;
	}
	public Long getTaxa_juros() {
		return taxa_juros;
	}
	public void setTaxa_juros(Long taxa_juros) {
		this.taxa_juros = taxa_juros;
	}

}
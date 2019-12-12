package cae;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Planos {
	@Id
	private Long cod_plano;
	private Long duracao;
	private String desc_plano;
	private Long valor;
	@ManyToOne
	private Set<Func_CAE> id_func;
	
	public Long getCod_plano() {
		return cod_plano;
	}
	public void setCod_plano(Long cod_plano) {
		this.cod_plano = cod_plano;
	}
	public Long getDuracao() {
		return duracao;
	}
	public void setDuracao(Long duracao) {
		this.duracao = duracao;
	}
	public String getDesc_plano() {
		return desc_plano;
	}
	public void setDesc_plano(String desc_plano) {
		this.desc_plano = desc_plano;
	}
	public Set<Func_CAE> getId_func() {
		return id_func;
	}
	public void setId_func(Set<Func_CAE> id_func) {
		this.id_func = id_func;
	}
	public Long getValor() {
		return valor;
	}
	public void setValor(Long valor) {
		this.valor = valor;
	}
}
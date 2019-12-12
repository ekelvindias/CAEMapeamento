package cae;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Clientes {
	
	@Id
	private Long id_Cliente;
	private String nome_empresa;
	private String cnpj;
	private String contato;
	private String Localizacao;
	private String Gerente;
	
	public Long getId_Cliente() {
		return id_Cliente;
	}
	public void setId_Cliente(Long id_Cliente) {
		this.id_Cliente = id_Cliente;
	}
	public String getNome_empresa() {
		return nome_empresa;
	}
	public void setNome_empresa(String nome_empresa) {
		this.nome_empresa = nome_empresa;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getLocalizacao() {
		return Localizacao;
	}
	public void setLocalizacao(String localizacao) {
		Localizacao = localizacao;
	}
	public String getGerente() {
		return Gerente;
	}
	public void setGerente(String gerente) {
		Gerente = gerente;
	}

}

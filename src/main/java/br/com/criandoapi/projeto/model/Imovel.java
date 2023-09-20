package br.com.criandoapi.projeto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "imovel")
public class Imovel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "tipo", length = 200, nullable = true)
	private String tipo;
	
	@Column(name = "descricao", length = 200, nullable = true)
	private String descricao;
	
	@Column(name = "quartos", length = 10, nullable = true)
	private Integer quartos;
	
	@Column(name = "area", nullable = true)
	private Double area;
	
	@Column(name = "valor", nullable = true)
	private Double valor;
	
	@Column(name = "garagem", length = 50, nullable = true)
	private String garagem;
	
	@Column(name = "senha", columnDefinition = "TEXT", nullable = true)
	private String senha;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getQuartos() {
		return quartos;
	}
	public void setQuartos(Integer quartos) {
		this.quartos = quartos;
	}
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getGaragem() {
		return garagem;
	}
	public void setGaragem(String garagem) {
		this.garagem = garagem;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}

package br.com.distribuicaoprocesso.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(schema= "public", name = "tb_processo")
public class Processo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_processo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProcesso;
	@Column(name = "nr_processo")
	private String numero;
	@OneToOne
	@JoinColumn(name = "id_vara")
	private Vara vara;
	@OneToOne
	@JoinColumn(name = "id_classe")
	private Classe classe;
	
	public Long getIdProcesso() {
		return idProcesso;
	}
	public void setIdProcesso(Long idProcesso) {
		this.idProcesso = idProcesso;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Vara getVara() {
		return vara;
	}
	public void setVara(Vara vara) {
		this.vara = vara;
	}
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}

}

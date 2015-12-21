package br.com.distribuicaoprocesso.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema= "public", name = "tb_competencia")
public class Competencia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_competencia")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCompetencia;
	@Column(name  = "cd_competencia")
	private String codigo;
	@Column(name = "ds_competencia")
	private String descricao;
	
	public Long getIdCompetencia() {
		return idCompetencia;
	}
	public void setIdCompetencia(Long idCompetencia) {
		this.idCompetencia = idCompetencia;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result
				+ ((idCompetencia == null) ? 0 : idCompetencia.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Competencia other = (Competencia) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (idCompetencia == null) {
			if (other.idCompetencia != null)
				return false;
		} else if (!idCompetencia.equals(other.idCompetencia))
			return false;
		return true;
	}

}

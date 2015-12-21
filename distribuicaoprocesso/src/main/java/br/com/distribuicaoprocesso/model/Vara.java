package br.com.distribuicaoprocesso.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema= "public", name = "tb_vara")
public class Vara implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_vara")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVara;
	@Column(name = "cd_vara")
	private String codigo;
	@Column(name = "ds_vara")
	private String descricao;
	@ManyToOne
	@JoinColumn(name = "id_comarca")
	private Comarca comarca;
	
	public Long getIdVara() {
		return idVara;
	}
	public void setIdVara(Long idVara) {
		this.idVara = idVara;
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
		result = prime * result + ((idVara == null) ? 0 : idVara.hashCode());
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
		Vara other = (Vara) obj;
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
		if (idVara == null) {
			if (other.idVara != null)
				return false;
		} else if (!idVara.equals(other.idVara))
			return false;
		return true;
	}
	public Comarca getComarca() {
		return comarca;
	}
	public void setComarca(Comarca comarca) {
		this.comarca = comarca;
	}
	

}

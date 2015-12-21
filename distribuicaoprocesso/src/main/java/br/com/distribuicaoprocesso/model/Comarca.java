package br.com.distribuicaoprocesso.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(schema= "public", name = "tb_comarca")
public class Comarca implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_comarca")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idComarca;
	@Column(name = "cd_comarca")
	private String codigo;
	@Column(name ="ds_comarca")
	private String descricao;
	@OneToMany(mappedBy = "comarca")
	private Set<Vara> varas;
	
	public Long getIdComarca() {
		return idComarca;
	}
	public void setIdComarca(Long idComarca) {
		this.idComarca = idComarca;
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
	public Set<Vara> getVaras() {
		return varas;
	}
	public void setVaras(Set<Vara> varas) {
		this.varas = varas;
	}

}

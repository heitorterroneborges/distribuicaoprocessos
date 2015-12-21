package br.com.distribuicaoprocesso.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(schema= "public", name = "tb_classe_competencia")
public class ClasseCompetencia implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_classe_competencia" )
	private Long idClasseCompetencia;
	@OneToOne
	@JoinColumn(name = "id_classe")
	private Classe classe;
	@ManyToOne
	@JoinColumn(name = "id_competencia")
	private Competencia competencia;
	
	public Long getIdClasseCompetencia() {
		return idClasseCompetencia;
	}
	public void setIdClasseCompetencia(Long idClasseCompetencia) {
		this.idClasseCompetencia = idClasseCompetencia;
	}
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	public Competencia getCompetencia() {
		return competencia;
	}
	public void setCompetencia(Competencia competencia) {
		this.competencia = competencia;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((classe == null) ? 0 : classe.hashCode());
		result = prime * result
				+ ((competencia == null) ? 0 : competencia.hashCode());
		result = prime
				* result
				+ ((idClasseCompetencia == null) ? 0 : idClasseCompetencia
						.hashCode());
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
		ClasseCompetencia other = (ClasseCompetencia) obj;
		if (classe == null) {
			if (other.classe != null)
				return false;
		} else if (!classe.equals(other.classe))
			return false;
		if (competencia == null) {
			if (other.competencia != null)
				return false;
		} else if (!competencia.equals(other.competencia))
			return false;
		if (idClasseCompetencia == null) {
			if (other.idClasseCompetencia != null)
				return false;
		} else if (!idClasseCompetencia.equals(other.idClasseCompetencia))
			return false;
		return true;
	}
	

}

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
@Table(schema= "public", name = "tb_vara_competencia")
public class VaraCompetencia implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_vara_competencia")
	private Long idVaraCompetencia;
	
	@OneToOne
	@JoinColumn(name= "id_vara")
	private Vara vara;
	
	@ManyToOne
	@JoinColumn(name = "id_competencia")
	private Competencia competencia;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((competencia == null) ? 0 : competencia.hashCode());
		result = prime
				* result
				+ ((idVaraCompetencia == null) ? 0 : idVaraCompetencia
						.hashCode());
		result = prime * result + ((vara == null) ? 0 : vara.hashCode());
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
		VaraCompetencia other = (VaraCompetencia) obj;
		if (competencia == null) {
			if (other.competencia != null)
				return false;
		} else if (!competencia.equals(other.competencia))
			return false;
		if (idVaraCompetencia == null) {
			if (other.idVaraCompetencia != null)
				return false;
		} else if (!idVaraCompetencia.equals(other.idVaraCompetencia))
			return false;
		if (vara == null) {
			if (other.vara != null)
				return false;
		} else if (!vara.equals(other.vara))
			return false;
		return true;
	}

}

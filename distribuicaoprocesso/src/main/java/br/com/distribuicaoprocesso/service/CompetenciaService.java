package br.com.distribuicaoprocesso.service;

import java.util.List;

import javax.inject.Inject;

import br.com.distribuicaoprocesso.model.Competencia;
import br.com.distribuicaoprocesso.persistence.CompetenciaDAO;

public class CompetenciaService  implements ICompetenciaService {
	
	@Inject
	private CompetenciaDAO competenciaDAO;
	
	public Competencia salvar(Competencia competencia) {
		return competenciaDAO.update(competencia);
	}

	@Override
	public List<Competencia> listarTodas() {
		return competenciaDAO.findAll();
	}

}

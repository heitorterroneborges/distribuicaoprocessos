package br.com.distribuicaoprocesso.service;

import javax.inject.Inject;

import br.com.distribuicaoprocesso.model.Classe;
import br.com.distribuicaoprocesso.persistence.ClasseDAO;

public class ClasseService implements IClasseService {
	
	@Inject
	private ClasseDAO classeDAO;

	@Override
	public void salvar(Classe classe) {
		classeDAO.save(classe);
	}

}

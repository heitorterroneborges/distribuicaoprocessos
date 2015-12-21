package br.com.distribuicaoprocesso.service;

import javax.inject.Inject;

import br.com.distribuicaoprocesso.model.Comarca;
import br.com.distribuicaoprocesso.persistence.ComarcaDAO;

public class ComarcaService implements IComarcaService {
	
	@Inject
	private ComarcaDAO comarcaDAO;

	@Override
	public void salvar(Comarca comarca) {
		comarcaDAO.update(comarca);
	}

}

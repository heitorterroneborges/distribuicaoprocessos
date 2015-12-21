package br.com.distribuicaoprocesso.service;

import javax.inject.Inject;

import br.com.distribuicaoprocesso.model.Vara;
import br.com.distribuicaoprocesso.persistence.VaraDAO;

public class VaraService implements IVaraService {

	@Inject
	private VaraDAO varaDAO;
	
	@Override
	public void salvar(Vara vara) {
		varaDAO.update(vara);
	}

}

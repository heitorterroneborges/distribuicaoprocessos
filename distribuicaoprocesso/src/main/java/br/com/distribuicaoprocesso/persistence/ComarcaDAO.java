package br.com.distribuicaoprocesso.persistence;

import br.com.distribuicaoprocesso.model.Comarca;

public class ComarcaDAO extends GenericDAO<Comarca> {

	private static final long serialVersionUID = 1L;

	public ComarcaDAO() {
		super(Comarca.class);
	}

}

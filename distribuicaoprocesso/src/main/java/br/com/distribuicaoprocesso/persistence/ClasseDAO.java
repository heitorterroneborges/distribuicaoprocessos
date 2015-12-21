package br.com.distribuicaoprocesso.persistence;

import br.com.distribuicaoprocesso.model.Classe;

public class ClasseDAO  extends GenericDAO<Classe> {

	private static final long serialVersionUID = 1L;

	public ClasseDAO() {
		super(Classe.class);
	}
}

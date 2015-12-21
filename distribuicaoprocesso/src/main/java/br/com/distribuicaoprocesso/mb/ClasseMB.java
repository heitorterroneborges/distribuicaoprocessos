package br.com.distribuicaoprocesso.mb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.distribuicaoprocesso.model.Classe;
import br.com.distribuicaoprocesso.service.IClasseService;

@Named(value = "classeMB")
@RequestScoped
public class ClasseMB {
	
	@Inject
	private Classe classe;
	@Inject
	private IClasseService classeService;
	
	public void salvar(){
		classeService.salvar(classe);
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}
}

package br.com.distribuicaoprocesso.mb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.distribuicaoprocesso.model.Comarca;
import br.com.distribuicaoprocesso.service.IComarcaService;

@Named(value = "comaracaMB")
@RequestScoped
public class ComaracaMB {
	@Inject
	private Comarca comarca;
	@Inject
	private IComarcaService comarcaService;
	
	public void salvar(){
		comarcaService.salvar(comarca);
	}

	public Comarca getComarca() {
		return comarca;
	}

	public void setComarca(Comarca comarca) {
		this.comarca = comarca;
	}

}

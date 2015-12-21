package br.com.distribuicaoprocesso.mb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.distribuicaoprocesso.model.Vara;
import br.com.distribuicaoprocesso.service.IVaraService;

@Named(value = "varaMB")
@RequestScoped
public class VaraMB {
	@Inject
	private Vara vara;
	@Inject
	private IVaraService varaService;

	public void salvar() {
		varaService.salvar(vara);
	}

	public Vara getVara() {
		return vara;
	}

	public void setVara(Vara vara) {
		this.vara = vara;
	}

}

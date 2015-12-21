package br.com.distribuicaoprocesso.mb;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.distribuicaoprocesso.model.Competencia;
import br.com.distribuicaoprocesso.service.ICompetenciaService;

@Named(value = "competenciaMB")
@RequestScoped
public class CompetenciaMB implements Serializable {
	
	@Inject
	private Competencia competencia;
	@Inject
	private Competencia competenciaSelecionada;
	
	private List<Competencia> competenciaList;
	
	@Inject
	private ICompetenciaService competenciaService;
	
	@PostConstruct
	public void init(){
		competencia = new Competencia();
		competenciaList = competenciaService.listarTodas();
	}
	
	public void salvar() {
		competenciaService.salvar(competencia);
		init();
	}
	
	public void alterar() {
		competenciaService.salvar(competenciaSelecionada);
		init();
	}
	public void selecionar(){
		competencia = getCompetenciaSelecionada();
	}
	public Competencia getCompetencia() {
		return competencia;
	}

	public void setCompetencia(Competencia competencia) {
		this.competencia = competencia;
	}

	public Competencia getCompetenciaSelecionada() {
		return competenciaSelecionada;
	}

	public void setCompetenciaSelecionada(Competencia competenciaSelecionada) {
		this.competenciaSelecionada = competenciaSelecionada;
	}

	public List<Competencia> getCompetenciaList() {
		return competenciaList;
	}

	public void setCompetenciaList(List<Competencia> competenciaList) {
		this.competenciaList = competenciaList;
	}
}

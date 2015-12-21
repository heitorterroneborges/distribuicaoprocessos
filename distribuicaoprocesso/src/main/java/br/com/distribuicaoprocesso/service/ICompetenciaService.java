package br.com.distribuicaoprocesso.service;

import java.util.List;

import br.com.distribuicaoprocesso.model.Competencia;

public interface ICompetenciaService {
	public Competencia salvar(Competencia competencia);

	public List<Competencia> listarTodas();
}

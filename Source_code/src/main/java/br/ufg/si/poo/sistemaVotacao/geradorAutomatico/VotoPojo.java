package br.ufg.si.poo.sistemaVotacao.geradorAutomatico;

import br.ufg.si.poo.sistemaVotacao.candidatos.DeputadosEstaduais;
import br.ufg.si.poo.sistemaVotacao.candidatos.DeputadosFederais;
import br.ufg.si.poo.sistemaVotacao.candidatos.Governadores;
import br.ufg.si.poo.sistemaVotacao.candidatos.Presidentes;
import br.ufg.si.poo.sistemaVotacao.candidatos.Senadores;

/**
 * @author Bruno Nogueira<br>
 *
 * <p>Classe representa um objeto voto;
 *
 */
public class VotoPojo {

	private DeputadosFederais deputadoFederal;
	private DeputadosEstaduais deputadoEstadual;
	private Senadores senador;
	private Governadores governador;
	private Presidentes presidente;

	/**
	 * Construtor padrao da Classe VotoPojo
	 * @param deputadoFederal
	 * @param deputadoEstadual
	 * @param senador
	 * @param governador
	 * @param presidente
	 */
	public VotoPojo(DeputadosFederais deputadoFederal,
			DeputadosEstaduais deputadoEstadual, Senadores senador,
			Governadores governador, Presidentes presidente) {
		this.deputadoFederal = deputadoFederal;
		this.deputadoEstadual = deputadoEstadual;
		this.senador = senador;
		this.governador = governador;
		this.presidente = presidente;
	}

	/**
	 * @return the deputadoFederal
	 */
	public DeputadosFederais getDeputadoFederal() {
		return deputadoFederal;
	}
	/**
	 * @return the deputadoEstadual
	 */
	public DeputadosEstaduais getDeputadoEstadual() {
		return deputadoEstadual;
	}
	/**
	 * @return the senador
	 */
	public Senadores getSenador() {
		return senador;
	}
	/**
	 * @return the governador
	 */
	public Governadores getGovernador() {
		return governador;
	}
	/**
	 * @return the presidente
	 */
	public Presidentes getPresidente() {
		return presidente;
	}


}

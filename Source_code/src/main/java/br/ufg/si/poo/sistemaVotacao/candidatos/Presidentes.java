package br.ufg.si.poo.sistemaVotacao.candidatos;

/**
 * @author Bruno Nogueira<br>
 *
 * <p> Enumeração que guarda informações sobre os Presidentes.
 * <p> O presidente contém:<br><br>
 * * <b>Nome:</b> Nome completo do candidato<br>
 * * <b>Numero:</b> Numero de identificacao do candidato. <u>Observacao:</u> Esse numero devera conter 2 digitos,
 *  ou seja, estar entre 10 e 99 inclusive<br>
 * * <b>Partido:</b> Sigla do partido político ao qual aquele candidato pertence<br>
 */
public enum Presidentes {

	BRANCO("Branco", 0, ""),
	NULO("Anulado", 99, ""),
	DILMA("Dilma", 13, "PT"),
	AECIO_NEVES("Aécio Neves", 45, "PSDB"),
	MARINA_SILVA("Marina Silva", 40, "PSB"),
	LUCIANA_GENRO("Luciana Genro", 50, "PSOL"),
	PASTOR_EVERALDO("Pastor Everaldo", 20, "PSC"),
	EDUARDO_JORGE("Eduardo Jorge", 43, "PV"),
	LEVY_FIDELIX("Levy Fidelix", 28, "PRTB"),
	ZE_MARIA("Zé Maria", 16, "PSTU"),
	EYMAEL("Eymael", 27, "PSDC"),
	MAURO_IASI("Mauro Iasi", 21, "PCB"),
	RUI_COSTA_PIMENTA("Rui Costa Pimenta", 29, "PCO");


	private String nomeCandidato;

	private int numero;
	private String siglaPartido;

	Presidentes(String nomeCandidato, int numero, String siglaPartido) {
		this.nomeCandidato = nomeCandidato;
		this.numero = numero;
		this.siglaPartido = siglaPartido;
	}

	/**
	 * @return the nomeCandidato
	 */
	public String getNomeCandidato() {
		return nomeCandidato;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @return the siglaPartido
	 */
	public String getSiglaPartido() {
		return siglaPartido;
	}

	public String toString() {
		return getNomeCandidato() + ";" + getNumero() + ";" + getSiglaPartido();
	}
}

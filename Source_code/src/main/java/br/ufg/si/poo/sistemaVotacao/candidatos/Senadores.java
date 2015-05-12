package br.ufg.si.poo.sistemaVotacao.candidatos;

/**
 * @author Bruno Nogueira<br>
 *
 * <p> Enumeração que guarda informações sobre os Senadores candidatos.
 * <p> Os Senadores contém:<br><br>
 * * <b>Nome:</b> Nome completo do candidato<br>
 * * <b>Numero:</b> Numero de identificacao do candidato. <u>Observacao:</u> Esse numero devera conter 3 digitos,
 *  ou seja, estar entre 100 e 999 inclusive<br>
 * * <b>Partido:</b> Sigla do partido político ao qual aquele candidato pertence<br>
 */
public enum Senadores {

	BRANCO("Branco", 0, ""),
	NULO("Anulado", 999, ""),
	RONALDO_CAIADO("Ronaldo Caiado", 251, "DEM"),
	VILMAR_ROCHA("Vilmar Rocha", 551, "PSD"),
	MARINA_SANTANNA("Marina Sant'Anna", 131, "PT"),
	AGUIMAR_JESUINO("Aguimar Jesuíno", 401, "PSB"),
	ELBER_SAMPAIO("Elber Sampaio", 500, "PSOL"),
	ALDO_MURO("Aldo Muro", 271, "PSDC"),
	ANTONIO_NETO("Antonio Neto", 210, "PCB");

	private String nomeCandidato;

	private int numero;
	private String siglaPartido;

	Senadores(String nomeCandidato, int numero, String siglaPartido) {
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

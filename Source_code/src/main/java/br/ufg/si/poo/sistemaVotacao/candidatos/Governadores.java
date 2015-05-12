package br.ufg.si.poo.sistemaVotacao.candidatos;

/**
 * @author Bruno Nogueira<br>
 *
 * <p> Enumeração que guarda informações sobre os Governadores.
 * <p> O governador contém:<br><br>
 * * <b>Nome:</b> Nome completo do candidato<br>
 * * <b>Numero:</b> Numero de identificacao do candidato. <u>Observacao:</u> Esse numero devera conter 2 digitos,
 *  ou seja, estar entre 10 e 99 inclusive<br>
 * * <b>Partido:</b> Sigla do partido político ao qual aquele candidato pertence<br>
 */
public enum Governadores {

	BRANCO("Branco", 0, ""),
	NULO("Anulado", 99, ""),
	MARCONI_PERILLO("Marconi Perillo", 45, "PSDB"),
	IRIS_REZENDE("Iris Rezende", 15, "PMDB"),
	VANDERLAN_CARDOSO("Vanderlan Cardoso", 40, "PSB"),
	ANTONIO_GOMIDE("Antonio Gomide", 13, "PT"),
	PROFESSOR_WESLEI("Professor Weslei", 50, "PSOL"),
	MARTA_JANE("Marta Jane", 21, "PCB"),
	ALEXANDRE_MAGALHAES("Alexandre Magalhães", 27, "PSDC");

	private String nomeCandidato;

	private int numero;
	private String siglaPartido;

	Governadores(String nomeCandidato, int numero, String siglaPartido) {
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

package br.ufg.si.poo.sistemaVotacao.candidatos;

/**
 * @author Bruno Nogueira<br>
 *
 * <p> Enumeração que guarda informações sobre o Deputado Estadual.
 * <p> O deputado estadual contém:<br><br>
 * * <b>Nome:</b> Nome completo do candidato<br>
 * * <b>Numero:</b> Numero de identificacao do candidato. <u>Observacao:</u> Esse numero devera conter 5 digitos,
 *  ou seja, estar entre 10000 e 99999 inclusive<br>
 * * <b>Partido:</b> Sigla do partido político ao qual aquele candidato pertence<br>
 */
public enum DeputadosEstaduais {

	BRANCO("Branco", 0, ""),
	NULO("Anulado", 99999, ""),
	MANE_DE_OLIVEIRA("Mané de Oliveira", 45111, "PSDB"),
	PAULO_CEZAR_MARTINS("Paulo Cezar Martins", 15601, "PMDB"),
	LINCOLN_TEJOTA("Lincoln Tejota", 55555, "PSD"),
	JOSE_VITTI("José Vitti", 45678, "PSDB"),
	DELEGADA_ADRIANA_ACCORSI("Delegada Adriana Accorsi", 13123, "PT"),
	HENRIQUE_ARANTES("Henrique Arantes", 14141, "PTB"),
	BRUNO_PEIXOTO("Bruno Peixoto", 15700, "PMDB"),
	VIRMONDES_CRUVINEL("Virmondes Cruvinel", 55123, "PSD"),
	ISO_MOREIRA("Iso Moreira", 45780, "PSDB"),
	MARQUINHOS_DO_PRIVE("Marquinhos do Privê", 45000, "PSDB"),
	ZE_ANTONIO("Zé Antônio", 14147, "PTB"),
	ABID_ELIAS("Abid Elias", 15111, "PMDB"),
	TALLES_BARRETO("Talles Barreto", 14123, "PTB"),
	CLAUDIO_MEIRELLES("Cláudio Meirelles", 22690, "PR"),
	ALVARO_GUIMARAES("Alvaro Guimarães", 22122, "PR"),
	JEAN("Jean", 31221, "PHS"),
	VALCENOR_BRAZ("Valcenor Braz", 14800, "PTB");


	private String nomeCandidato;

	private int numero;
	private String siglaPartido;

	DeputadosEstaduais(String nomeCandidato, int numero, String siglaPartido) {
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

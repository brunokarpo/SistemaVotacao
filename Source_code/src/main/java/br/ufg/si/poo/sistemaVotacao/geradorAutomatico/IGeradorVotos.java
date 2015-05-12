package br.ufg.si.poo.sistemaVotacao.geradorAutomatico;
/**
 * @author Bruno Nogueira<br>
 *
 * <p>Interface que fornece o serviço de geração automática de votos;
 *
 */
public interface IGeradorVotos {
	/**
	 * Método que faz a geração de um objeto Voto para ser gravado;
	 * @return VotoPojo contendo um voto de um eleitor;
	 */
	public VotoPojo gerarVoto();

}

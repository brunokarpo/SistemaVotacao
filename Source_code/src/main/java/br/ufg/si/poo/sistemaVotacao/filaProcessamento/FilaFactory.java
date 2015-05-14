package br.ufg.si.poo.sistemaVotacao.filaProcessamento;

public class FilaFactory {

	private static FilaFactory filaFactory;

	private IFilaProcessamento fila;

	private FilaFactory() {
		//Singleton

		// Só tem uma implementação. Se começar existir outras, inicializar fila em outro metodo;
		fila = new FilaProcessamentoImpl();
	}

	public static FilaFactory getFilaFactory() {
		if(filaFactory == null) {
			filaFactory = new FilaFactory();
		}
		return filaFactory;
	}

	public IFilaProcessamento getFila() {
		return fila;
	}
}

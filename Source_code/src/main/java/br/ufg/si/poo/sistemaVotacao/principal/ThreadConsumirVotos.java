package br.ufg.si.poo.sistemaVotacao.principal;

import br.ufg.si.poo.sistemaVotacao.filaProcessamento.IFilaProcessamento;
import br.ufg.si.poo.sistemaVotacao.geradorAutomatico.VotoPojo;
import br.ufg.si.poo.sistemaVotacao.manipuladorArquivos.IManipuladorArquivo;
import br.ufg.si.poo.sistemaVotacao.manipuladorArquivos.ManipuladorArquivoImpl;

class ThreadConsumirVotos implements Runnable {

	private IFilaProcessamento fila;
	private IManipuladorArquivo manipuladorArquivo;

	ThreadConsumirVotos(IFilaProcessamento fila) {
		this.fila = fila;
		manipuladorArquivo = new ManipuladorArquivoImpl();
	}

	public void run() {

		while(true) {
			VotoPojo voto = fila.consumirVoto();

			if(voto == null) {
				try {
					// Não tenho votos. Durmo por 5 segundos
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					System.err.println("Problema ao tentar dormir");
				}
				continue; //vou para o próximo ciclo
			}

			manipuladorArquivo.gravarVoto(voto);
		}

	}

}

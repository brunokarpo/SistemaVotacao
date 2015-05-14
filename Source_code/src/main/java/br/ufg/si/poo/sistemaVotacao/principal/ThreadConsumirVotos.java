package br.ufg.si.poo.sistemaVotacao.principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.ufg.si.poo.sistemaVotacao.filaProcessamento.IFilaProcessamento;
import br.ufg.si.poo.sistemaVotacao.geradorAutomatico.VotoPojo;
import br.ufg.si.poo.sistemaVotacao.manipuladorArquivos.IManipuladorArquivo;
import br.ufg.si.poo.sistemaVotacao.manipuladorArquivos.ManipuladorArquivoImpl;

class ThreadConsumirVotos implements Runnable {

	private static final Logger LOG = LoggerFactory.getLogger(ThreadConsumirVotos.class);

	private IFilaProcessamento fila;
	private IManipuladorArquivo manipuladorArquivo;
	private int cont;

	ThreadConsumirVotos(IFilaProcessamento fila) {
		this.fila = fila;
		manipuladorArquivo = new ManipuladorArquivoImpl();
		cont = 0;
	}

	public void run() {

		LOG.info("Iniciando consumo da fila");
		while(cont < 10) {
			LOG.info("Pegando um voto da fila");
			VotoPojo voto = fila.consumirVoto();

			if(voto == null) {
				try {
					LOG.info("Não tenho votos para consumir. Vou aguardar 5 segundos.");
					Thread.sleep(5000);
					cont++;
				} catch (InterruptedException e) {
					LOG.error("Tenho problemas para dormir agora!", e);
				}
			} else {
				LOG.info("Vamos gravar o voto no arquivo!");
				manipuladorArquivo.gravarVoto(voto);
				cont = 0;
			}
		}

		LOG.info("Estou a 5 minutos sem fazer nada. Então adeus!");

	}

}

package br.ufg.si.poo.sistemaVotacao.filaProcessamento;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.ufg.si.poo.sistemaVotacao.geradorAutomatico.VotoPojo;

public class FilaProcessamentoImpl implements IFilaProcessamento {

	private static final Logger LOG = LoggerFactory.getLogger(FilaProcessamentoImpl.class);
	private List<VotoPojo> votos;

	FilaProcessamentoImpl() {
		votos = new ArrayList<VotoPojo>();
	}

	public void armazenarVoto(VotoPojo voto) {
		LOG.info("Armazenando voto...");
		votos.add(voto);
		LOG.info("Voto armazenado!");
	}

	public VotoPojo consumirVoto() {
		VotoPojo voto = null;

		LOG.info("Verificando se tem votos na fila");
		if(votos.size() > 0) {
			LOG.info("Encontrei um voto. Vou consumí-lo");
			voto = votos.get(0);
			votos.remove(0);
			LOG.info("Voto consumido e retirado da fila");
		}

		return voto;
	}

}

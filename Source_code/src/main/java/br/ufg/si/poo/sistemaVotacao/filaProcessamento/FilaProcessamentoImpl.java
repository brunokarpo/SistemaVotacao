package br.ufg.si.poo.sistemaVotacao.filaProcessamento;

import java.util.ArrayList;
import java.util.List;

import br.ufg.si.poo.sistemaVotacao.geradorAutomatico.VotoPojo;

public class FilaProcessamentoImpl implements IFilaProcessamento {

	private List<VotoPojo> votos;

	FilaProcessamentoImpl() {
		votos = new ArrayList<VotoPojo>();
	}

	public void armazenarVoto(VotoPojo voto) {
		votos.add(voto);
	}

	public VotoPojo consumirVoto() {
		// TODO Auto-generated method stub
		return null;
	}

}

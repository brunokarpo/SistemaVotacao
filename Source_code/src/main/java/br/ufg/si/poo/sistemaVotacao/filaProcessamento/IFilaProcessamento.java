package br.ufg.si.poo.sistemaVotacao.filaProcessamento;

import br.ufg.si.poo.sistemaVotacao.geradorAutomatico.VotoPojo;

public interface IFilaProcessamento {

	public void armazenarVoto(VotoPojo voto);

	public VotoPojo consumirVoto() ;

}

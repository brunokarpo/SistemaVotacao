package br.ufg.si.poo.sistemaVotacao.manipuladorArquivos;

import br.ufg.si.poo.sistemaVotacao.geradorAutomatico.VotoPojo;

public interface IManipuladorArquivo {

	public static final String NOME_ARQUIVO = "/votos.txt";

	public void gravarVoto(VotoPojo voto) ;

}

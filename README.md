# SistemaVotacao
Projeto para a turma de Programação Orientada à Objetos;

Motivacao
---------
Interessada em ensinar aos alunos de Programação Orientada à Objetos do terceiro período de Sistemas de Informação na Universidade Federal de Goiás o conceito de manipulação de arquivos em JAVA,  a Professora Ana Claúdia solicitou um projeto para que pudessemos colocar em prática os conceitos ensinados em sala.

Fiz a seguinte proposta de exercício:

/*********************************************************************************************************************/
(Situação hipotética) "Nosso sistema eleitoral hoje funciona com dois softwares:
1. O software da urna, que registra os votos de cada eleitor em uma base de dados interna durante o período de votação;
2. O software que contabiliza os votos no final de uma votação;

Nesse cenário, ao final do período de votação o software da URNA gera um relatório contendo os registros de todos os votos feitos ali. Cada voto segue o seguinte padrão e o relatório possui várias linhas contendo essa informação;

---------------------------------------------------------------------
Deputado_Federal;"Nome Candidato";"Número Candidato";"Sigla Partido"
Deputado_Estadual;"Nome Candidato";"Número Candidato";"Sigla Partido"
Senador;"Nome Candidato";"Número Candidato";"Sigla Partido"
Governador;"Nome Candidato";"Número Candidato";"Sigla Partido"
Presidente;"Nome Candidato";"Número Candidato";"Sigla Partido"
---------------------------------------------------------------------

A proposta do trabalho é: dado um arquivo contendo todos os registros de votos em uma urna, criar um software que contabilize todos os votos e informe quais os candidatos mais votados em cada cargo político, sendo que serão eleitos 5 Deputados Federais, 5 Deputados Estaduais, 2 Senadores, 1 Governador e 1 Presidente"

/*********************************************************************************************************************/

Para atender o proposto acima irei desenvolver um pequeno software que gere o arquivo contendo um possível resultado de uma urna. Esse software deverá gerar um arquivo texto contendo cerca de 200 mil registros que simulem possíveis combinações de votos de eleitores.

O arquivo gerado deverá ser processado pelos alunos através dos scripts que eles criarão para trabalhar o sistema de contabilização dos votos.

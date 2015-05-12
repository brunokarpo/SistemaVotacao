Fluxo.md
========

Aqui explicaremos basicamente qual o fluxo que será adotado pela aplicação.

Como funcionará
---------------

O programa deve gerar de maneira aleatória possíveis combinações de votos. Hoje, quando o eleitor vai às urnas votar ele vota na seguinte sequência (hipotética):
1. Deputado Estadual
2. Deputado Federal
3. Senador
4. Governador
5. Presidente

O candidato é identificado por um número que representa seu número identificador na eleição, nome completo e partido do qual faz parte. O usuário pode votar em um candidato diretamente, em branco ou nulo.

* Os votos dados diretamente ao candidato são contabilizados para ele obviamente.
* Os votos brancos não são contabilizados para nenhum candidato, ficando como votos omissos e que são distribuídos ao final da votação segundo uma lógica específica. Esses votos são apenas 'brancos' e não pertencem a nenhum partido
* Os votos nulos são votos dados a números de candidatos inexistente na urna. Esses votos são contabilizados no final das eleições como 'votos que não devem ser dados a nenhum candidato'.


Arquivo de relatório
--------------------

O arquivo de relatório contém vários registros de votos. (Ideal 250 mil registros cada arquivo);
Cada registro de votos é composto no arquivo segundo a seguinte lógica:

Deputado_Federal;"Nome Candidato";"Número Candidato";"Sigla Partido"  
Deputado_Estadual;"Nome Candidato";"Número Candidato";"Sigla Partido"  
Senador;"Nome Candidato";"Número Candidato";"Sigla Partido"  
Governador;"Nome Candidato";"Número Candidato";"Sigla Partido"  
Presidente;"Nome Candidato";"Número Candidato";"Sigla Partido"  

Um registro de voto é separado do próximo por uma quebra de linha;
As ordens dos candidatos devem ser sempre igual a ordem apresentada acima.

Não é objetivo desse projeto discutir segurança do sistema eleitoral, por isso o sistema gerará o relatório sem nenhuma criptografia e em arquivo texto puro;

Módulos
-------

A aplicação deve ter os seguintes módulos:
* Enumerações: um pacote que contém as enumerações de todos os candidatos disponíveis para cada cargo político. Logo, um enum para deputado federal, um para deputado estadual, um para senador, outro para governador e um para presidente;
 * Os atríbutos de cada constante no enum deve ser: "Nome Candidato"(String), "Número candidato"(inteiro), "Sigla Partido"(String);

* Gerador aleatório: esse pequeno sistema deverá gerar uma cédula de votação pegando candidatos aleatórios de acordo com as enumerações. Observe que ele pode gerar votos brancos e nulos;
* Gravador de arquivo: esse script deve gravar o registro gerado pelo Gerador Aleatório no arquivo de texto, criando-o se não existir ou então inserindo novo registro se o arquivo já existir;

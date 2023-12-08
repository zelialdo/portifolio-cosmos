# Gerenciador Universal de Produções Acadêmicas - GUPA

## O que é e a que se destina?
### Ferramenta para cadastro e consulta das produções acadêmicas. O acesso às produções foi facilitado por meio de tags de busca.

## Equipe: Cosmos Tech

### Integrantes

* Pedro Silva
* Weynne Guimarães
* Zelialdo Lima
* Isabel Gonçalves
* Victor Costa
* Wendislau Victor

### O projeto foi construído em Java, com o uso do framework Spring Boot. A solução consiste num CRUD para as produções do portifólio do professor Gustavo Alexandre, coordenador de projetos PBL. Foi construído também um sistema de busca por tags, que inicialmente, representam o tipo de produção (TEXTO, VIDEO, PODCAST, OUTRO), mas futuramente podem fazer referência ao tema, linguagem utilizada para construção, tecnologias envolvidas, etc.

## Como executar o projeto?

1. Fazer o download do projeto pelo git bash meio do comando *'git clone'* na branch `master`;
2. Executar a aplicação na sua IDE preferida;
3. Abrir a ferramenta do Postman, para verificar os endpoints de acordo com a tabela abaixo:

| Endpoint                          | Método        | Como configurar o Postman?                                                                                    | Descrição                             |
| --------------------------------- |:-------------:|---------------------------------------------------------------------------------------------------------------|---------------------------------------|
| *localhost:8080/producoes/card*   | [GET]         | Somente clicar no botão 'SEND'.                                                                               | Lista de projetos em forma de cards.  |
| *localhost:8080/producoes*        | [POST]        | Inserir um Objeto JSON no campo Body.                                                                         | Cadastrar uma produção.               |
| *localhost:8080/producoes{id}*    | [PUT]         | Inserir um Objeto JSON no campo Body.                                                                         | Atualizar uma produção por id.        |
| *localhost:8080/producoes{id}*    | [DELETE]      | Setar o valor do id na URL do endpoint.                                                                       | Deletar uma produção por id.          |
| *localhost:8080/producoes/tag*    | [GET]         | Nos parâmetros, inserir a expressão 'tagEnum' no campo 'Key' e o valor da tag a ser buscada no campo 'Value'. | Busca por tag.                        |


### OBS: *Usamos a IDE do Visual Studio Code.*

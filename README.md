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

### O projeto foi construído em Java, com o uso do framework Spring Boot. A solução consiste num CRUD para as produções do portifólio do professor Gustavo Alexandre, coordenador de projetos PBL. Foi construído também um sistema de busca por tags, que inicialmente, representam o tipo de produção, mas futuramente podem fazer referência ao tema, linguagem utilizada para construção, tecnologias envolvidas, etc.

## Como executar o projeto?

1. Fazer o download do projeto pelo git bash meio do comando *'git clone'* na branch `master`;
2. Executar a aplicação na sua IDE preferida;
3. Abrir a ferramenta do Postman, para verificar os endpoints de acordo com a tabela abaixo:

| Endpoint                          | Método        | Descrição                             |
| --------------------------------- |:-------------:|-------------                          |
| *localhost:8080/producoes/card*   | [GET]         | Lista de projetos em forma de cards   |
| *localhost:8080/producoes*        | [POST]        | Cadastrar uma produção                |
| *localhost:8080/producoes{id}*    | [PUT]         | Atualizar uma produção por id         |
| *localhost:8080/producoes{id}*    | [DELETE]      | Deletar uma produção por id           |
| *localhost:8080/producoes/tag*    | [GET]         | Busca por tag                         |


### OBS: *Usamos a IDE do Visual Studio Code.*

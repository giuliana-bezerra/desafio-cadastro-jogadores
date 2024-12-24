<h1 align="center">
  Desafio Cadastro Jogadores
</h1>

<p align="center">
 <img src="https://img.shields.io/static/v1?label=Youtube&message=@giulianabezerra&color=8257E5&labelColor=000000" alt="@giulianabezerra" />
 <img src="https://img.shields.io/static/v1?label=Tipo&message=Desafio&color=8257E5&labelColor=000000" alt="Desafio" />
</p>

Esse projeto apresentado [nesse vídeo](https://www.youtube.com/watch?v=SovNeqEQXD8) demonstra a resolução desse [desafio](https://github.com/uolhost/test-backEnd-Java.git) que propõe a criação de um sistema de cadastro de jogadores.

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Web](https://docs.spring.io/spring-framework/reference/web.html)
- [Jdbc Client](https://docs.spring.io/spring-boot/reference/data/sql.html#data.sql.jdbc-client)
- [Rest Client](https://docs.spring.io/spring-framework/reference/integration/rest-clients.html#rest-restclient)
- [Thymeleaf](https://docs.spring.io/spring-framework/reference/web/webmvc-view/mvc-thymeleaf.html)
- [Spring Tests](https://docs.spring.io/spring-framework/reference/testing.html)

## Funcionalidades

- [x] Cadastro de Jogador
- [x] Listagem de Jogador
- [x] Tela de Cadastro e Listagem
- [x] Validações e Tratamento de Exceções 
- [x] Teste de Integração

## Arquitetura

O projeto foi elaborado seguindo a arquitetura sugerida no desafio, conforme imagem abaixo:

![Arquitetura](.github/arquitetura.png)

Algumas mudanças poderiam melhorar ainda mais a arquitetura do projeto atual:

- [ ] Cache dos codinomes em uso (Redis)
- [ ] Frontend Apartado do Backend
- [ ] Ferramenta de Banco de Dados Corporativa
- [ ] Carregar codinomes das fontes externas
- [ ] Funcionalidades de Editar e Remover
- [ ] Suites de Teste

## Como executar

- Clonar repositório git:
```
git clone https://github.com/giuliana-bezerra/desafio-cadastro-jogadores.git
```
- Construir o projeto:
```
./mvnw clean package
```
- Executar:
```
java -jar ./target/desafio-cadastro-jogadores-0.0.1-SNAPSHOT.jar
```

A tela inicial pode ser acessada em `http://localhost:8080/cadastro-jogador`.
package br.com.giulianabezerra.desafio_cadastro_jogadores.repository;

import java.util.List;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import br.com.giulianabezerra.desafio_cadastro_jogadores.model.GrupoCodinome;
import br.com.giulianabezerra.desafio_cadastro_jogadores.model.Jogador;

@Repository
public class JogadorRepository {
  private final JdbcClient jdbcClient;

  public JogadorRepository(JdbcClient jdbcClient) {
    this.jdbcClient = jdbcClient;
  }

  public Jogador salvar(Jogador jogador) {
    jdbcClient.sql("""
         INSERT INTO JOGADORES (nome, email, telefone, codinome, grupo_codinome)
         VALUES (:nome, :email, :telefone, :codinome, :grupoCodinome)
        """)
        .param("nome", jogador.nome())
        .param("email", jogador.email())
        .param("telefone", jogador.telefone())
        .param("codinome", jogador.codinome())
        .param("grupoCodinome", jogador.grupoCodinome().name())
        .update();

    return jogador;
  }

  public List<String> listarCodinomesEmUso(GrupoCodinome grupoCodinome) {
    return jdbcClient.sql("SELECT distinct(codinome) FROM JOGADORES WHERE grupo_codinome = :grupoCodinome")
        .param("grupoCodinome", grupoCodinome.name())
        .query(String.class)
        .list();
  }

  public List<Jogador> listarJogadores() {
    return jdbcClient.sql("SELECT * FROM JOGADORES ORDER BY LOWER(nome), id")
        .query(Jogador.class)
        .list();
  }
}

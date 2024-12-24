package br.com.giulianabezerra.desafio_cadastro_jogadores.repository;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.giulianabezerra.desafio_cadastro_jogadores.model.GrupoCodinome;
import br.com.giulianabezerra.desafio_cadastro_jogadores.web.CodinomeDTO;
import br.com.giulianabezerra.desafio_cadastro_jogadores.web.VingadoresDTO;

@Repository
public class VingadoresRepository implements CodinomeRepository {
  public CodinomeDTO buscarCodinomes() throws JsonMappingException, JsonProcessingException {
    var codinomes = RestClient
        .builder()
        .defaultHeader(HttpHeaders.ACCEPT, MediaType.TEXT_PLAIN_VALUE)
        .baseUrl(GrupoCodinome.VINGADORES.getUri())
        .build()
        .get()
        .retrieve()
        .body(String.class);

    ObjectMapper objectMapper = new ObjectMapper();
    var vingadores = objectMapper.readValue(codinomes, VingadoresDTO.class);

    return vingadores;
  }
}

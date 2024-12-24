package br.com.giulianabezerra.desafio_cadastro_jogadores.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import br.com.giulianabezerra.desafio_cadastro_jogadores.model.GrupoCodinome;
import br.com.giulianabezerra.desafio_cadastro_jogadores.web.CodinomeDTO;
import br.com.giulianabezerra.desafio_cadastro_jogadores.web.LigaDaJusticaDTO;

@Repository
public class LigaDaJusticaRepository implements CodinomeRepository {
  @Override
  public CodinomeDTO buscarCodinomes() throws JsonMappingException, JsonProcessingException {
    var codinomes = RestClient.builder()
        .baseUrl(GrupoCodinome.LIGA_DA_JUSTICA.getUri())
        .build()
        .get()
        .retrieve()
        .body(String.class);

    var xmlMapper = new XmlMapper();

    var ligaDaJustica = xmlMapper.readValue(codinomes, LigaDaJusticaDTO.class);
    return ligaDaJustica;
  }
}

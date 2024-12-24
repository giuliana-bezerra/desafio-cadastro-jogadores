package br.com.giulianabezerra.desafio_cadastro_jogadores.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import br.com.giulianabezerra.desafio_cadastro_jogadores.web.CodinomeDTO;

public interface CodinomeRepository {
  CodinomeDTO buscarCodinomes() throws JsonMappingException, JsonProcessingException;
}

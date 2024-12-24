package br.com.giulianabezerra.desafio_cadastro_jogadores.model;

import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Validated
public record Jogador(
        @NotBlank String nome, @NotBlank @Email String email, String telefone, String codinome,
        @NotNull GrupoCodinome grupoCodinome) {

    public Jogador withCodinome(String codinome) {
        return new Jogador(nome, email, telefone, codinome, grupoCodinome);
    }
}

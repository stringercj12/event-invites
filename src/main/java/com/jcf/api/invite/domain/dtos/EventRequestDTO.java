package com.jcf.api.invite.domain.dtos;

public record EventRequestDTO(
        String nome,
        String descricao,
        String local,
        String data,
        String capa,
        String telefone,
        String email
) {}

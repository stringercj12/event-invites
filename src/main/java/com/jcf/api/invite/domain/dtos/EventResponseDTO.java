package com.jcf.api.invite.domain.dtos;

import java.util.UUID;

public record EventResponseDTO(
        UUID id,
        String nome,
        String descricao,
        String local,
        String data,
        String capa,
        String telefone,
        String email
){
}

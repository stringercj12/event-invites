package com.jcf.api.invite.domain.models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "convidados")
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String nome;
    private String descricao;
    private String email;
    private String telefone;
    private String dataDeNascimento;
    private Integer idade;

}

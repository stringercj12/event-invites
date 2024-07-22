package com.jcf.api.invite.domain.models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "eventos")
@Data
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String nome;
    private String descricao;
    private String local;
    private String data;
    private String capa;
    private String telefone;
    private String email;

}

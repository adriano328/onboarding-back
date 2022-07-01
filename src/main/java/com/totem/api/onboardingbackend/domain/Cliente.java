package com.totem.api.onboardingbackend.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String tipo;

    @Column
    private String cpfoucnpj;

    @Column
    private String inscricaoEstadual;

    @Column
    private boolean situacao;

    @Column
    private String nomeRazao;

    @Column
    private Boolean sexo;

    @Column
    private String dtaNascimento;


}

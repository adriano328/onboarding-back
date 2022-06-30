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
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String endereco;

    @Column
    private String bairro;

    @Column
    private String cep;

    @Column
    private String municio;

    @Column
    private String uf;

}

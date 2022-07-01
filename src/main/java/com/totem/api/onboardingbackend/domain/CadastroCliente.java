package com.totem.api.onboardingbackend.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CadastroCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @OneToOne
    @JoinColumn(name = "endereco_id", nullable = false)
    Endereco endereco;

    @OneToMany
    @JoinColumn(name = "telefone_id", nullable = false)
    List<Telefone> telefone;

    @OneToMany
    @JoinColumn(name = "email_id", nullable = false)
    List<Email> email;




}

package com.totem.api.onboardingbackend.domain;

import com.totem.api.onboardingbackend.Enum.SexoEnum;
import com.totem.api.onboardingbackend.Enum.TipoClienteEnum;
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
    private TipoClienteEnum tipo;

    @Column
    private String cpfoucnpj;

    @Column
    private String inscricaoEstadual;

    @Column
    private boolean situacao;

    @Column
    private String nomeRazao;

    @Column
    private SexoEnum sexo;

    @Column
    private String dtaNascimento;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "telefone_id")
    private Telefone telefone;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "email_id")
    private Email email;

}

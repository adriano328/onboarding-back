package com.totem.api.onboardingbackend.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.totem.api.onboardingbackend.Enum.ProdutoSituacaoEnum;
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
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nome;

    @OneToOne
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JoinColumn(name = "categoria_id", nullable = false)
    Categoria categoria;

    @Column
    private ProdutoSituacaoEnum situacao;

}

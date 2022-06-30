package com.totem.api.onboardingbackend.service.endereco;

import com.totem.api.onboardingbackend.domain.Endereco;
import com.totem.api.onboardingbackend.repositories.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EnderecoService {

    Endereco getById(Integer id);

    Endereco save(Endereco endereco);

    Endereco update(Endereco endereco);

    void delete(Integer id);

    List<Endereco> findAll();



}

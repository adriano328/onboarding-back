package com.totem.api.onboardingbackend.service.endereco;

import com.totem.api.onboardingbackend.domain.Endereco;
import com.totem.api.onboardingbackend.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoImpl implements EnderecoService{

    @Autowired
    EnderecoRepository enderecoRepository;

    @Override
    public Endereco getById(Integer id) {
        return enderecoRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Endereço não existe!"));
    }

    @Override
    public Endereco save(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    @Override
    public Endereco update(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    @Override
    public void delete(Integer id) {
        enderecoRepository.deleteById(id);
    }

    @Override
    public List<Endereco> findAll() {
        return enderecoRepository.findAll();
    }



}

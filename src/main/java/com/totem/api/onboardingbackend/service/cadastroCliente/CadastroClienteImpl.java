package com.totem.api.onboardingbackend.service.cadastroCliente;

import com.totem.api.onboardingbackend.domain.CadastroCliente;
import com.totem.api.onboardingbackend.repositories.CadastroClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastroClienteImpl implements CadastroClienteService{

    @Autowired
    CadastroClienteRepository cadastroClienteRepository;

    @Override
    public CadastroCliente getById(Integer id) {
        return cadastroClienteRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Cadastro não localizado!"));
    }

    @Override
    public CadastroCliente save(CadastroCliente cadastroCliente) {
        return cadastroClienteRepository.save(cadastroCliente);
    }

    @Override
    public List<CadastroCliente> findAll() {
        return cadastroClienteRepository.findAll();
    }
}

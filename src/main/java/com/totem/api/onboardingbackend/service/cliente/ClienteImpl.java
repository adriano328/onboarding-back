package com.totem.api.onboardingbackend.service.cliente;

import com.totem.api.onboardingbackend.domain.Cliente;
import com.totem.api.onboardingbackend.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteImpl implements ClienteService{

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente getById(Integer id) {
        return clienteRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Cliente não localizado"));
    }

    @Override
    public void delete(Integer id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente update(Cliente cliente) {
        return clienteRepository.save(cliente);
    }



}

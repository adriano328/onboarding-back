package com.totem.api.onboardingbackend.service.cliente;

import com.totem.api.onboardingbackend.domain.Cliente;
import com.totem.api.onboardingbackend.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface ClienteService {

    Cliente save(Cliente cliente);

    Cliente getById(Integer id);

    void delete (Integer id);

    Cliente update(Cliente cliente);
}

package com.totem.api.onboardingbackend.service.cadastroCliente;

import com.totem.api.onboardingbackend.domain.CadastroCliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CadastroClienteService {

    CadastroCliente getById(Integer id);

    CadastroCliente save(CadastroCliente cadastroCliente);

    List<CadastroCliente> findAll();

}

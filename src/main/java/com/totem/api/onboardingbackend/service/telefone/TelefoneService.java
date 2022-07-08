package com.totem.api.onboardingbackend.service.telefone;

import com.totem.api.onboardingbackend.domain.Telefone;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TelefoneService {

    Telefone save(Telefone telefone);

    Telefone getById(Integer id);

    Telefone update(Telefone telefone);

    void delete(Integer id);

    List<Telefone> findAll();

}

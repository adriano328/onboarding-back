package com.totem.api.onboardingbackend.service.telefone;

import com.totem.api.onboardingbackend.domain.Telefone;
import com.totem.api.onboardingbackend.repositories.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelefoneImpl implements TelefoneService{

    @Autowired
    TelefoneRepository telefoneRepository;

    @Override
    public Telefone save(Telefone telefone) {
        return telefoneRepository.save(telefone);
    }

    @Override
    public Telefone getById(Integer id) {
        return telefoneRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Telefone não localizado!"));
    }

    @Override
    public Telefone update(Telefone telefone) {
        return telefoneRepository.save(telefone);
    }

    @Override
    public void delete(Integer id) {
        telefoneRepository.deleteById(id);
    }

    @Override
    public List<Telefone> findAll() {
        return telefoneRepository.findAll();
    }
}

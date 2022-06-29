package com.totem.api.onboardingbackend.service.categoria;

import com.totem.api.onboardingbackend.domain.Categoria;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoriaService {

    Categoria save(Categoria categoria);

    Categoria getById(Integer id);

    List<Categoria> findAll();

    void delete(Integer id);

    Categoria update(Categoria categoria);

    List<Categoria> findCategoriaByName(String nome);

}

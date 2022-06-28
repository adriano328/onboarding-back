package com.totem.api.onboardingbackend.service.categoria;

import com.totem.api.onboardingbackend.domain.Categoria;
import org.springframework.stereotype.Service;

@Service
public interface CategoriaService {

    Categoria save(Categoria categoria);

    Categoria getById(Integer id);

    void delete(Integer id);

    Categoria update(Categoria categoria);


}

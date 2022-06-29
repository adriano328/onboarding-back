package com.totem.api.onboardingbackend.service.categoria;

import com.totem.api.onboardingbackend.domain.Categoria;
import com.totem.api.onboardingbackend.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaImpl implements CategoriaService{

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Categoria getById(Integer id) {
        return categoriaRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Categoria não localizada"));
    }

    public void delete(Integer id){

        categoriaRepository.deleteById(id);
    }

    public Categoria update(Categoria categoria){
        return categoriaRepository.save(categoria);
    }
}

package com.totem.api.onboardingbackend.service.categoria;

import com.totem.api.onboardingbackend.domain.Categoria;
import com.totem.api.onboardingbackend.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }


    public void delete(Integer id){

        categoriaRepository.deleteById(id);
    }

    public Categoria update(Integer id, Categoria categoria){
        Categoria categoriaUpdate = getById(id);
        categoriaUpdate.setId(id);
        categoriaUpdate.setNome(categoria.getNome());
        categoriaUpdate.setSituacao(categoria.getSituacao());
        return categoriaRepository.save(categoriaUpdate);
    }

    @Override
    public List<Categoria> findCategoriaByName(String nome) {

        return categoriaRepository.findByNomeContainingIgnoreCase(nome);
    }


}

package com.totem.api.onboardingbackend.service.usuario;

import com.totem.api.onboardingbackend.domain.Usuario;
import com.totem.api.onboardingbackend.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioImpl implements UsuarioService{

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario getById(Integer id) {
        return usuarioRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Usuario não localizado"));
    }

    @Override
    public void delete(Integer id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario update(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public List<Usuario> findUsuarioPorNome(String nome) {
        return usuarioRepository.findByNomeContainingIgnoreCase(nome);
    }
}

package com.totem.api.onboardingbackend.service.usuario;

import com.totem.api.onboardingbackend.domain.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService {

    Usuario save(Usuario usuario);

    Usuario getById(Integer id);

    void delete(Integer id);

    Usuario update(Usuario usuario);

    List<Usuario> findAll();

    List<Usuario> findUsuarioPorNome(String nome);

}

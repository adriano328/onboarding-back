package com.totem.api.onboardingbackend.repositories;

import com.totem.api.onboardingbackend.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    List<Usuario> findByNomeContainingIgnoreCase(String nome);

}

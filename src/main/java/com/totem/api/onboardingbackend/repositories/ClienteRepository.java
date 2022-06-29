package com.totem.api.onboardingbackend.repositories;

import com.totem.api.onboardingbackend.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    List<Cliente> findByNomeContainingIgnoreCase(String nome);

}

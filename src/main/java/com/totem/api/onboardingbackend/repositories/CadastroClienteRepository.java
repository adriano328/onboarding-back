package com.totem.api.onboardingbackend.repositories;

import com.totem.api.onboardingbackend.domain.CadastroCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroClienteRepository extends JpaRepository<CadastroCliente, Integer> {
}

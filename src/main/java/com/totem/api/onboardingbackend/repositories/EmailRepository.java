package com.totem.api.onboardingbackend.repositories;

import com.totem.api.onboardingbackend.domain.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<Email, Integer> {
}

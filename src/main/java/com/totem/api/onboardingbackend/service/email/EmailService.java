package com.totem.api.onboardingbackend.service.email;

import com.totem.api.onboardingbackend.domain.Email;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmailService {

    Email save(Email email);

    Email getById(Integer id);

    void delete (Integer id);

    Email update(Email email);

    List<Email> findAll();

}

package com.totem.api.onboardingbackend.service.email;

import com.totem.api.onboardingbackend.domain.Email;
import com.totem.api.onboardingbackend.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailImpl implements EmailService{

    @Autowired
    EmailRepository emailRepository;

    @Override
    public Email save(Email email) {
        return emailRepository.save(email);
    }

    @Override
    public Email getById(Integer id) {
        return emailRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("E-mail não localizado!"));
    }

    @Override
    public void delete(Integer id) {
        emailRepository.deleteById(id);
    }

    @Override
    public Email update(Email email) {
        return emailRepository.save(email);
    }

    @Override
    public List<Email> findAll() {
        return emailRepository.findAll();
    }


}

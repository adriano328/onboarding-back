package com.totem.api.onboardingbackend.Enum.controller;

import com.totem.api.onboardingbackend.domain.Email;
import com.totem.api.onboardingbackend.service.email.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/email")
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class EmailController {

    @Autowired
    EmailService emailService;

    @PostMapping()
    ResponseEntity<Email> save(@RequestBody Email email){
        return ResponseEntity.ok(emailService.save(email));
    }

    @GetMapping("/{id}")
    ResponseEntity<Email> getById(@PathVariable Integer id){
        return ResponseEntity.ok(emailService.getById(id));
    }

    @DeleteMapping
    public void delete (@PathVariable Integer id){
        emailService.delete(id);
    }

    @PutMapping()
    ResponseEntity<Email>update(@RequestBody Email email){
        return ResponseEntity.ok(emailService.save(email));
    }

    @GetMapping("/lista-email")
    public List<Email> listar(){
        return emailService.findAll();
    }

}

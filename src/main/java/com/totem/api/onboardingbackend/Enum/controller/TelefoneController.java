package com.totem.api.onboardingbackend.Enum.controller;

import com.totem.api.onboardingbackend.domain.Telefone;
import com.totem.api.onboardingbackend.service.telefone.TelefoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/telefone")
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class TelefoneController {

    @Autowired
    TelefoneService telefoneService;

    @PostMapping()
    ResponseEntity<Telefone> save(@RequestBody Telefone telefone){
        return ResponseEntity.ok(telefoneService.save(telefone));
    }

    @GetMapping("/{id}")
    ResponseEntity<Telefone> getById(@PathVariable Integer id){
        return ResponseEntity.ok(telefoneService.getById(id));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        telefoneService.delete(id);
    }

    @PutMapping()
    ResponseEntity<Telefone> update(@RequestBody Telefone telefone){
        return ResponseEntity.ok(telefoneService.save(telefone));
    }

    @GetMapping("/lista-telefone")
    public List<Telefone> listar(){
       return telefoneService.findAll();
    }



}

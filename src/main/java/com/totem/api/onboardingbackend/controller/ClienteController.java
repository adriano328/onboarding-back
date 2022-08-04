package com.totem.api.onboardingbackend.controller;

import com.totem.api.onboardingbackend.domain.Categoria;
import com.totem.api.onboardingbackend.domain.Cliente;
import com.totem.api.onboardingbackend.service.cliente.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/cliente")
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping
    ResponseEntity<Cliente> save(@RequestBody Cliente cliente){
        var x =clienteService.save(cliente);
        return ResponseEntity.ok(x);
    }

    @GetMapping("/{id}")
    ResponseEntity<Cliente> getById(@PathVariable Integer id){
        return ResponseEntity.ok(clienteService.getById(id));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        clienteService.delete(id);
    }

    @PutMapping()
    ResponseEntity<Cliente> update(@RequestBody Cliente cliente){
        return ResponseEntity.ok(clienteService.update(cliente));
    }

}

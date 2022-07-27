package com.totem.api.onboardingbackend.controller;

import com.totem.api.onboardingbackend.domain.Categoria;
import com.totem.api.onboardingbackend.domain.Cliente;
import com.totem.api.onboardingbackend.service.cliente.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cliente")
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping()
    ResponseEntity<Cliente> save(@RequestBody Cliente cliente){
        return ResponseEntity.ok(clienteService.save(cliente));
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

    @GetMapping("/lista-cliente")
    public List<Cliente> listar(){
        return clienteService.findAll();
    }

    @GetMapping("/listar-por-nome")
    ResponseEntity<List<Cliente>> listarPorNome(@RequestParam ("nomeRazao") String nomeRazao){
        return ResponseEntity.ok().body(clienteService.findClienteByName(nomeRazao));
    }

}

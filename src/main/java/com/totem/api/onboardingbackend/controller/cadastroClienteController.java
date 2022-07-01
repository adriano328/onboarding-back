package com.totem.api.onboardingbackend.controller;

import com.totem.api.onboardingbackend.domain.CadastroCliente;
import com.totem.api.onboardingbackend.service.cadastroCliente.CadastroClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cadastro-cliente")
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class cadastroClienteController {

    @Autowired
    CadastroClienteService cadastroClienteService;

    @PostMapping()
    ResponseEntity<CadastroCliente> save(CadastroCliente cadastroCliente){
        return ResponseEntity.ok(cadastroClienteService.save(cadastroCliente));
    }

    @GetMapping("/lista-clientes")
    public List<CadastroCliente> listar(){
        return cadastroClienteService.findAll();
    }

    @GetMapping("/{id}")
    ResponseEntity<CadastroCliente> getById(Integer id){
        return ResponseEntity.ok(cadastroClienteService.getById(id));
    }


}

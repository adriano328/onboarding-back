package com.totem.api.onboardingbackend.controller;

import com.totem.api.onboardingbackend.Enum.ClienteSituacaoEnum;
import com.totem.api.onboardingbackend.domain.Categoria;
import com.totem.api.onboardingbackend.domain.Cliente;
import com.totem.api.onboardingbackend.domain.Produto;
import com.totem.api.onboardingbackend.service.cliente.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
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

    @GetMapping("/{id}")
    ResponseEntity<Cliente> getById(@PathVariable Integer id){
        return ResponseEntity.ok(clienteService.getById(id));
    }

    @GetMapping
    public  List<Cliente> listar(Pageable pageable,
                                 @RequestParam(required = false) String nomeRazao,
                                 @RequestParam(required = false) ClienteSituacaoEnum situacao){
            var response = this.clienteService.findByFilters(nomeRazao, situacao);
            return response;
    }



    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        clienteService.delete(id);
    }

    @PutMapping("{id}")
    ResponseEntity<Cliente> update(@PathVariable Integer id, @RequestBody Cliente cliente){
        return ResponseEntity.ok(clienteService.update(cliente, id));
    }

    @PostMapping
    ResponseEntity<Cliente> save(@RequestBody Cliente cliente){
        var x =clienteService.save(cliente);
        return ResponseEntity.ok(x);
    }




}

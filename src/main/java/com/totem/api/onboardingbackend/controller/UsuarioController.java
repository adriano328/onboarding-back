package com.totem.api.onboardingbackend.controller;

import com.totem.api.onboardingbackend.domain.Produto;
import com.totem.api.onboardingbackend.domain.Usuario;
import com.totem.api.onboardingbackend.service.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@RestController
@RequestMapping(value = "usuario")
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping()
    ResponseEntity<Usuario> save(@RequestBody Usuario usuario){
        return ResponseEntity.ok(usuarioService.save(usuario));

    }

    @GetMapping("/{id}")
    ResponseEntity<Usuario> getById(@PathVariable Integer id){

        return ResponseEntity.ok(usuarioService.getById(id));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){

        usuarioService.delete(id);
    }

    @PutMapping()
    ResponseEntity<Usuario> update(@RequestBody Usuario usuario){
        return ResponseEntity.ok(usuarioService.save(usuario));
    }

    @GetMapping("/lista-usuario")
    public List<Usuario> listar(){
        return usuarioService.findAll();
    }

    @GetMapping("/listar-por-nome")
    ResponseEntity<List<Usuario>> listarPorNome(@RequestParam ("nome") String nome){
        return ResponseEntity.ok().body(usuarioService.findUsuarioPorNome(nome));
    }
}

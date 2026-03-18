package com.senai.epi.controller;
import com.senai.epi.dtos.UsuarioDto;
import com.senai.epi.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;

    }

    @PostMapping("/usuario")
    public ResponseEntity<String> Create (@RequestBody UsuarioDto usuarioDto) {
        boolean retorno = service.cadastrar(usuarioDto);
        if(retorno) {
            return ResponseEntity.ok().body("Cadastrado com sucesso!");
        }else {
            return ResponseEntity.badRequest().body("Já existe este login cadastrado!");

        }
    }

}

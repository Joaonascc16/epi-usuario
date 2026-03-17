package com.senai.epi.controller;

import com.senai.epi.dtos.UsuarioDto;
import com.senai.epi.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<UsuarioService> Create (@RequestBody UsuarioDto usuarioDto) {
        service.cadastrar(usuarioDto);
        return new ResponseEntity<>(service, HttpStatus.CREATED);

    }
    @GetMapping("/usuario/{id}")
    public ResponseEntity<UsuarioService> Read (@RequestBody UsuarioDto usuarioDto) {
        service.LerListaUsuario(usuarioDto);
        return new ResponseEntity<>(service, HttpStatus.OK);
    }
    @GetMapping("/usuario/{id}")
    public ResponseEntity<UsuarioService> Update (@RequestBody UsuarioDto usuarioDto) {
        service.atualizar(usuarioDto);
        return new ResponseEntity<>(service, HttpStatus.OK);
    }
    @GetMapping("/usuario/{id}")
        public ResponseEntity<UsuarioService> Delete (@RequestBody UsuarioDto usuarioDto) {
            service.deletar(usuarioDto);
            return new ResponseEntity<>(service, HttpStatus.OK);
        }

}

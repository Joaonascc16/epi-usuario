package com.senai.epi.service;

import com.senai.epi.dtos.UsuarioDto;
import com.senai.epi.entity.UsuarioEntity;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class UsuarioService {

    private List<UsuarioEntity> ListaUsuario = new ArrayList<UsuarioEntity>();

    public UsuarioEntity cadastrar(UsuarioDto usuarioDto){

        UsuarioEntity usuario = new UsuarioEntity();

        usuario.setCpf(usuarioDto.getCpf());
        usuario.setNome(usuarioDto.getNome());
        usuario.setEmail(usuarioDto.getEmail());
        usuario.setSenha(usuarioDto.getSenha());
        ListaUsuario.add(usuario);
        return usuario;
    }
    public List<UsuarioEntity> LerListaUsuario(UsuarioDto usuarioDto){
        return ListaUsuario;
    }
    public UsuarioEntity buscarPorId(Long id){
        return ListaUsuario.get(id.intValue());

    }
    public UsuarioEntity atualizar(UsuarioDto usuarioDto){
        UsuarioEntity usuario = ListaUsuario.get(ListaUsuario.intValue());
        usuario.setCpf(usuarioDto.getCpf());
        usuario.setNome(usuarioDto.getNome());
        usuario.setEmail(usuarioDto.getEmail());
        usuario.setSenha(usuarioDto.getSenha());
        return usuario;
    }
    public void deletar(UsuarioDto id) {
        ListaUsuario.remove(id.intValue());

    }

}

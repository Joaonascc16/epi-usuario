package com.senai.epi.service;

import com.senai.epi.dtos.UsuarioDto;
import com.senai.epi.entity.UsuarioEntity;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private List<UsuarioEntity> ListaUsuario = new ArrayList<UsuarioEntity>();

    public boolean cadastrar(UsuarioDto usuarioDto){

        for (UsuarioEntity usuario : ListaUsuario){
            if(usuario.getLogin().equals(usuarioDto.getLogin())){
               return false;
            }
        }
        UsuarioEntity usuario = new UsuarioEntity();

        usuario.setCpf(usuarioDto.getCpf());
        usuario.setNome(usuarioDto.getNome());
        usuario.setLogin(usuarioDto.getlogin());
        usuario.setSenha(usuarioDto.getSenha());
        ListaUsuario.add(usuario);

        return true;
    }


}

package com.senai.epi.dtos;

public class UsuarioDto {
    private String cpf;
    private String nome;
    private String login;
    private String senha;

    public UsuarioDto() {
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getlogin() {
        return login;
    }

    public void setEmail(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getLogin(){
        return login;
    }
    public void setLogin() {
        this.login = login;
    }

}

package com.senai.epi.entity;

public class UsuarioEntity {

    private String cpf;
    private String nome;
    private String login;
    private String senha;

    public UsuarioEntity() {
    }

    public UsuarioEntity(String nome, String email, String senha) {
        this.nome = nome;
        this.login = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return login;
    }

    public void setEmail(String email) {
        this.login = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    @Override
    public String toString() {
        return "UsuarioEntity{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}

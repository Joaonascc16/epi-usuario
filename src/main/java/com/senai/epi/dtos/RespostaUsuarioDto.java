package com.senai.epi.dtos;

public class RespostaUsuarioDto {
    private String cpf;
    private String nome;
    private String login;

    public RespostaUsuarioDto() {
    }

    public RespostaUsuarioDto(String cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.login = email;
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
}

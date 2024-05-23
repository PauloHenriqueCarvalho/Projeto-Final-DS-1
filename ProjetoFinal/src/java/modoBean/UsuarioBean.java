package modoBean;


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Senai
 */
public class UsuarioBean {
    
    private int id_usuario;
    private String nome;
    private String senha;
    private String usuario;
    private String telefone;
    private Date data_nascimento;
    private String cpf;
    private String adm;

    public UsuarioBean() {
    }

    public UsuarioBean(int id_usuario, String nome, String senha, String usuario, String telefone, Date data_nascimento, String cpf, String adm) {
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.senha = senha;
        this.usuario = usuario;
        this.telefone = telefone;
        this.data_nascimento = data_nascimento;
        this.cpf = cpf;
        this.adm = adm;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAdm() {
        return adm;
    }

    public void setAdm(String adm) {
        this.adm = adm;
    }
    
    
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3a.agenda.model;

/**
 *
 * @author Fernanda
 */
public class Contato {
    
    private  int id;
    private String nome;
    private String dataNasc;
    private String email;
    private String telFixo;
    private String telCelular;
    private String data;

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelFixo() {
        return telFixo;
    }
    public void setTelFixo(String telFixo) {
        this.telFixo = telFixo;
    }
    public String getTelCelular() {
        return telCelular;
    }
    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    
    
    
}

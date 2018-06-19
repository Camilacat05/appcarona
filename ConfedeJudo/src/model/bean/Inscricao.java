/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Alita
 */
public class Inscricao {
    
    private String NomeCamp;
    private String NomeAtleta;
    private int idade;
    private float peso;
    private float preco;
    private String grad;
    
    
    public String getNomeCamp() {
        return NomeCamp;
    }

    public void setNomeCamp(String NomeCamp) {
        this.NomeCamp = NomeCamp;
    }

    public String getNomeAtleta() {
        return NomeAtleta;
    }

    public void setNomeAtleta(String NomeAtleta) {
        this.NomeAtleta = NomeAtleta;
    }
    
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }
    
    
}

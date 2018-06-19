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
public class Aluno {
    
    private String nomeAluno;
    private String GraduacaoAlu;
    private String sexo;
    private int idade;

    public Aluno() {
        this.nomeAluno = "";
        this.GraduacaoAlu = "";
        this.sexo = "";
        this.idade = 0;
    }
 
    
    
    
    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getGraduacaoAlu() {
        return GraduacaoAlu;
    }

    public void setGraduacaoAlu(String GradAluno) {
        this.GraduacaoAlu= GradAluno;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}

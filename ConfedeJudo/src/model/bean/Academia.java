/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.sql.Array;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alita
 */
public class Academia {

    public static void setModel(DefaultTableModel AcademiaLista) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private String nomeAcademia;
    private String nomeProf;
    private String graduacaoProf;
    private String sexo;
    private String enderco;
    private int idade;

    public Academia() {
        
        this.nomeAcademia = "";
        this.nomeProf = "";
        this.graduacaoProf = "";
        this.sexo = "";
        this.enderco = "";
        this.idade = 0;
    }


    public String getNomeAcademia() {
        return nomeAcademia;
    }

    public void setNomeAcademia(String nomeAcademia) {
        this.nomeAcademia = nomeAcademia;
    }

    public String getNomeProf() {
        return nomeProf;
    }

    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }

    public String getGraduacaoProf() {
        return graduacaoProf;
    }

    public void setGraduacaoProf(String graduacaoProf) {
        this.graduacaoProf = graduacaoProf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEnderco() {
        return enderco;
    }

    public void setEnderco(String enderco) {
        this.enderco = enderco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}

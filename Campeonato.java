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
public class Campeonato {
    
    private String nomeCamp;
    private String ProfResp;
    private String localCamp;
    private int dataCamp;
    private float horario;
  

    public int getDataCamp() {
        return dataCamp;
    }

    public void setDataCamp(int dataCamp) {
        this.dataCamp = dataCamp;
    }

    public String getNomeCamp() {
        return nomeCamp;
    }

    public void setNomeCamp(String nomeCamp) {
        this.nomeCamp = nomeCamp;
    }

    public String getProfResp() {
        return ProfResp;
    }

    public void setProfResp(String ProfResp) {
        this.ProfResp = ProfResp;
    }

    public String getLocalCamp() {
        return localCamp;
    }

    public void setLocalCamp(String local) {
        this.localCamp = local;
    }

    public int getData() {
        return dataCamp;
    }

    public void setData(int data) {
        this.dataCamp = data;
    }

    public float getHorario() {
        return horario;
    }

    public void setHorario(float horario) {
        this.horario = horario;
    }
    
    
    
}

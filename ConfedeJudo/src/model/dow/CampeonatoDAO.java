/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dow;

import Conection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Campeonato;

/**
 *
 * @author Alita
 */
public class CampeonatoDAO {

    //Método usado para cadastrar os dados no banco
    public boolean cadastrarCampeonato(Campeonato camp) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;

        boolean resultado = false;
        try {
            if (verificaCampoVazio(camp) == false) {
                stat = con.prepareStatement("INSERT INTO campeonato(nomeCamp,ProfResp,localCamp,dataCamp,horario)VALUES(?,?,?,?,?)");

                stat.setString(1, camp.getNomeCamp());
                stat.setString(2, camp.getProfResp());
                stat.setString(3, camp.getLocalCamp());
                stat.setInt(4, camp.getDataCamp());
                stat.setFloat(5, camp.getHorario());
                stat.executeUpdate();
                resultado = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stat);
        }

        return resultado;
    }
    //Verificar algun campo vazio no momento do cadastro dos dados
    public boolean verificaCampoVazio(Campeonato camp) {

        if (camp.getNomeCamp().equals("") || camp.getProfResp().equals("") || camp.getLocalCamp().equals("")
                || (camp.getDataCamp() == 0) || (camp.getHorario() == 0)) {
            JOptionPane.showMessageDialog(null, "Campo Vazio!");
            return true;
        }
        return false;
    }
    //Verificar se o campo Nome campeonato está pegando números
    public boolean verificaNomeNumerico(Campeonato camp) {
        if ("12345".equals(camp.getNomeCamp())) {
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome do campeonato!");
            return true;
        } 
         return false;
    }
   //Verificar se o campo Nome campeonato está pegando caracter especial
    public boolean verificaNomeCaracterEspecial(Campeonato camp) {
        if ("@#$%&*".equals(camp.getNomeCamp())) {
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome do campeonato!");
            return true;
        } 
         return false;
    }
    //Verificar se o campo Nome campeonato está pegando caracter especial e números
     public boolean verificaNomeCaracterEspecialNumerico(Campeonato camp) {
        if ("123$%&*".equals(camp.getNomeCamp())) {
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome do campeonato!");
            return true;
        } 
         return false;
    }
     //Verificar se o campo Nome professor está pegando números
      public boolean verificaNomeProfNumerico(Campeonato camp){
          if ("12345".equals(camp.getProfResp())) {
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome do professor!");
            return true;
        } 
         return false;
      }
      //Verificar se o campo Nome professor está pegando caracter especial
      public boolean verificaNomeProfCaracterEspecial(Campeonato camp){
          if ("@#$%&*".equals(camp.getProfResp())) {
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome do professor!");
            return true;
        } 
         return false;
      }
      //Verificar se o campo Nome professor está pegando números e caracter especial
      public boolean verificaNomeProfCaracterEspecialNumerico(Campeonato camp){
          if ("@#$123".equals(camp.getProfResp())) {
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome do professor!");
            return true;
        } 
         return false;
      }
      //Verificar se o campo local campeonato está pegando número
       public boolean verificaNomeLocalCampNumerico(Campeonato camp) {
        if ("12345".equals(camp.getLocalCamp())) {
            JOptionPane.showMessageDialog(null, "Digite Novamente o local do campeonato!");
            return true;
        } 
         return false;
    }
    //Verificar se o campo local campeonato está pegando caracter especial
    public boolean verificaNomeLocalCampCaracterEspecial(Campeonato camp) {
        if ("@#$%&*".equals(camp.getLocalCamp())) {
            JOptionPane.showMessageDialog(null, "Digite Novamente o local do campeonato!");
            return true;
        } 
         return false;
    }
    //Verificar se o campo local campeonato está pegando caracter especial e número
    public boolean verificaNomeLocalCampCaracterEspecialNumerico(Campeonato camp) {
        if ("@#$123".equals(camp.getLocalCamp())) {
            JOptionPane.showMessageDialog(null, "Digite Novamente o local do campeonato!");
            return true;
        } 
         return false;
    }
    //Verifica se a data inserida é 0
    public boolean verificaNomeData(Campeonato camp){
        if (camp.getDataCamp() == 0) {
            JOptionPane.showMessageDialog(null, "Digite Novamente a data do campeonato!");
            return true;
        } 
         return false;
    }
    //Verifica se o horário é menor que 0
    public boolean verificaNomeHorarioMenor(Campeonato camp){
        if (camp.getHorario() < 0) {
            JOptionPane.showMessageDialog(null, "Digite Novamente o horário do campeonato!");
            return true;
        } 
         return false;
    }
    //Verifica se o horário é menor que 0
    public boolean verificaNomeHorarioMaior(Campeonato camp){
        if (camp.getHorario() > 0) {
            JOptionPane.showMessageDialog(null, "Digite Novamente o horário do campeonato!");
            return true;
        } 
         return false;
    }
    //Método para retornar todos os dados contidos
    public ArrayList<Campeonato> retornaTodosCampeonatos() {
        String cmd = "select * from campeonato order by idCamp desc;";
        ArrayList<Campeonato> results = new ArrayList<Campeonato>();
        Statement stmt;
        ResultSet dados = null;
        //String resultado = null;
        Campeonato campeonato = null;
        String nomeCamp = null, ProfResp = null, localCamp = null, dataCamp = null, horario = null;
        try {
            stmt = ConnectionFactory.prepareStatement(cmd);
            dados = stmt.executeQuery(cmd);

            while (dados.next()) {
                nomeCamp = dados.getString(1);
                ProfResp = dados.getString(2);
                localCamp = dados.getString(3);
                dataCamp = dados.getString(4);
                horario = dados.getString(5);

                results.add(campeonato);

            }

        } catch (SQLException ex) {
            Logger.getLogger(CampeonatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return results;
    }

}

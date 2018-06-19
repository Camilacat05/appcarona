/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dow;

import Conection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Aluno;
import model.bean.Inscricao;

/**
 *
 * @author Alita
 */
public class InscricaoDAO {
    
    //Método usado para cadastrar os dados no banco
     public boolean cadastrarInscricao(Inscricao inc){
     Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        boolean resultado = false;
        
        try {
            if (verificaCampoVazio(inc) == false) {
                stat = con.prepareStatement("INSERT INTO inscricao(grad,idade,peso,preco,NomeCamp,nomeAtleta)VALUES(?,?,?,?,?,?)");

                stat.setString(1,inc.getGrad());
                stat.setInt(2,inc.getIdade());
                stat.setFloat(3,inc.getPeso());
                stat.setFloat(4,inc.getPreco());
                stat.setString(5,inc.getNomeCamp());
                stat.setString(6,inc.getNomeAtleta());
                stat.executeUpdate();
                resultado = true;
            }  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex); 
        }finally{
            ConnectionFactory.closeConnection(con, stat);
        }
        
        return resultado;
    }
     //Verificar algun campo vazio no momento do cadastro dos dados
     public boolean verificaCampoVazio(Inscricao inc){
     
        if(inc.getGrad() == "" || inc.getIdade() == 0 || inc.getPeso() == 0 || inc.getPreco() == 0){
            JOptionPane.showMessageDialog(null,"Campo Vazio!");
            return true;
        }
        return false;
    }
    //Verificar se o campo Nome atleta está pegando números
     public boolean verificaNomeAtletaNumerico(Inscricao inc){
         if("12345".equals(inc.getNomeAtleta())){
             JOptionPane.showMessageDialog(null,"Digite Novamente o nome do atleta!");
             return true;
         }
         return false;
     }
     //Verificar se o campo Nome atleta está pegando caracter especial
    public boolean verificaNomeAtletaCaracterEspecial(Inscricao inc){
         if("@#$%&*".equals(inc.getNomeAtleta())){
             JOptionPane.showMessageDialog(null,"Digite Novamente o nome do atleta!");
             return true;
         }
         return false;
     }
    //Verificar se o campo Nome atleta está pegando caracter especial e número
     public boolean verificaNomeAtletaCaracterEspecialNumerico(Inscricao inc){
         if("@#$123".equals(inc.getNomeAtleta())){
             JOptionPane.showMessageDialog(null,"Digite Novamente o nome do atleta!");
             return true;
         }
         return false;
     }
      //Verificar se o campo Nome campeonato está pegando números
    public boolean verificaNomeCampNumerico(Inscricao inc){
         if("12345".equals(inc.getNomeCamp())){
             JOptionPane.showMessageDialog(null,"Digite Novamente o nome do campeonato!");
             return true;
         }
         return false;
     }
    //Verificar se o campo Nome campeonato está pegando caracter especial
    public boolean verificaNomeCampCaracterEspecial(Inscricao inc){
         if("@#$%&*".equals(inc.getNomeCamp())){
             JOptionPane.showMessageDialog(null,"Digite Novamente o nome do campeonato!");
             return true;
         }
         return false;
     }
    //Verificar se o campo Nome campeonato está pegando números e caracter especial
    public boolean verificaNomeCampCaracterEspecialNumerico(Inscricao inc){
         if("@#$123".equals(inc.getNomeCamp())){
             JOptionPane.showMessageDialog(null,"Digite Novamente o nome do campeonato!");
             return true;
         }
         return false;
     }
    //Verificar se o campo graduação está pegando números
    public boolean verificaNomeGraduacaoNumerico(Inscricao inc){
         if("12345".equals(inc.getGrad())){
             JOptionPane.showMessageDialog(null,"Digite Novamente a graduação!");
             return true;
         }
         return false;
    }
    //Verificar se o campo graduação está pegando caracter especial
    public boolean verificaNomeGraduacaoCaracterEspecial(Inscricao inc){
         if("@#$%&*".equals(inc.getGrad())){
             JOptionPane.showMessageDialog(null,"Digite Novamente a graduação");
             return true;
         }
         return false;
    }
    //Verificar se o campo graduação está pegando caracter especial e númerico
    public boolean verificaNomeGraduacaoCaracterEspecialNumerico(Inscricao inc){
         if("@#$123".equals(inc.getGrad())){
             JOptionPane.showMessageDialog(null,"Digite Novamente a graduação");
             return true;
         }
         return false;
    }
    //Verifica se idade é negativa
    public boolean verificaNomeIdadeMenor(Inscricao inc){
        if (inc.getIdade()< 0) {
            JOptionPane.showMessageDialog(null, "Digite Novamente a idade!");
            return true;
        } 
         return false;
    }
    //Verifica se pessoa é muito idosa
    public boolean verificaNomeIdadeMaior(Inscricao inc){
        if (inc.getIdade() > 0) {
            JOptionPane.showMessageDialog(null, "Digite Novamente a idade!");
            return true;
        } 
         return false;
    }
    //Verifica se o preço é menor que 0
    public boolean verificaPrecoMenor(Inscricao inc){
        if (inc.getPreco() < 0) {
            JOptionPane.showMessageDialog(null, "Digite Novamente o preço!");
            return true;
        } 
         return false;
    }
    //Verifica se o peso é menor que 0
     public boolean verificaPesoMenor(Inscricao inc){
        if (inc.getPeso() < 0) {
            JOptionPane.showMessageDialog(null, "Digite Novamente o peso!");
            return true;
        } 
         return false;
    }
}

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
import model.bean.Academia;
import model.bean.Aluno;

/**
 *
 * @author Alita
 */
public class AlunoDAO {

    
    //Método usado para cadastrar os dados no banco
    public boolean cadastrarAluno(Aluno al) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;

        boolean resultado = false;
        try {

            if (verificaCampoVazio(al) == false) {
                stat = con.prepareStatement("INSERT INTO aluno(nomeAluno,GraduacaoAlu,sexo,idade)VALUES(?,?,?,?)");

                stat.setString(1, al.getNomeAluno());
                stat.setString(2, al.getGraduacaoAlu());
                stat.setString(3, al.getSexo());
                stat.setInt(4, al.getIdade());
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
    //Permitir o cadastro de do sexo apenas dessas formas: M,F,Masculino,Feminino
    public boolean verificaSexo(Aluno al) {
        if (al.getSexo().equals("M") || al.getSexo().equals("F") || al.getSexo().equals("Masculino") || al.getSexo().equals("Feminino")) {
            return true;
        }
        JOptionPane.showMessageDialog(null, "Digite Novamente o sexo!");
        return false;
    }
     //Verificar se o campo sexo está pegando números
    public boolean verificaSexoNumerico(Aluno al){
        if(al.getSexo().equals("12345")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o sexo!");
             return true; 
        }
        return false;
    }
    //Verificar se o campo sexo está pegando caracteres especias
     public boolean verificaSexoCaractereEspecial(Aluno al){
         if(al.getSexo().equals("@#$%&")){
             JOptionPane.showMessageDialog(null, "Digite Novamente o sexo!");
             return true;
         }
         return false;
     }

     //Verificar se o campo sexo está pegando números e caracteres especias
     public boolean verificaSexoCaracterEspecialNumerico(Aluno al){
        if (al.getSexo().equals("@#$1234")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o sexo!");
            return true;
        }
        return false;
    }
    //Verificar se o campo Nome aluno está pegando números 
    public boolean verificaNomeNumericoAluno(Aluno al) {
        if (al.getNomeAluno().equals("12345")) {
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome do aluno!");
            return true;
        } else {
            return false;
        }
    }
    //Verificar se o campo Nome aluno está pegando caracter Especial
    public boolean verificaNomeCaractereEspecialAluno(Aluno al){
        if(al.getNomeAluno().equals("@&*%$")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome do aluno!");
            return true;
        }
        return false;
    }
    
    //Verificar se o campo Nome aluno está pegando números e caracteres especias
     public boolean verificaNomeAlunoCaracterEspecialNumerico(Aluno al){
        if (al.getNomeAluno().equals("@#$1234")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome do aluno!");
            return true;
        }
        return false;
    }
     //Verifica se idade é negativa
    public boolean verificaIdadeMenor(Aluno al) {
        if (al.getIdade() < 1) {
            JOptionPane.showMessageDialog(null, "Digite Novamente a idade!");
            return false;
        } else {
            return true;
        }
    }
    //Verifica se pessoa é muito idosa
    public boolean verificaIdadeMaior(Aluno al){
        if(al.getIdade() > 100){
            JOptionPane.showMessageDialog(null, "Digite Novamente a idade!");
            return true;
        }
        return false;
    }
    //Verificar algun campo vazio no momento do cadastro dos dados
    public boolean verificaCampoVazio(Aluno al) {

        if (al.getNomeAluno().equals("") || al.getGraduacaoAlu().equals("") || al.getSexo().equals("")
                || al.getIdade() == 0) {
            JOptionPane.showMessageDialog(null, "Campo Vazio!");
            return true;
        }
        return false;
    }
     //Verificar se o campo graduação está pegando caracteres especias
     public boolean verificaNomeCaractereEspecialGraduacao(Aluno al){
         if(al.getGraduacaoAlu().equals("@#$%&")){
             JOptionPane.showMessageDialog(null, "Digite Novamente a graduação!");
             return true;
         }
         return false;
     }
     
      //Verificar se o campo graduação está pegando números
     public boolean verificaNomeNumericoGraduacao(Aluno al){
         if(al.getGraduacaoAlu().equals("12345")){
             JOptionPane.showMessageDialog(null, "Digite Novamente a graduação!");
             return true;
         }
         return false;
     }
    //Verificar se o campo graduação está pegando números e caracteres especias
     public boolean verificaNomeGraduacaoCaracterEspecialNumerico(Aluno al){
        if (al.getGraduacaoAlu().equals("@#$1234")){
            JOptionPane.showMessageDialog(null, "Digite Novamente a graduação!");
            return true;
        }
        return false;
    }
      //Método para retornar todos os dados contidos
    public ArrayList<Aluno> retornaTodasAlunos() {
        String cmd = "select * from aluno order by idAluno desc;";
        ArrayList<Aluno> results = new ArrayList<Aluno>();
        Statement stmt;
        ResultSet dados = null;
        //String resultado = null;
        Aluno aluno = null;
        String nomeAluno = null, GraduacaoAlu = null, sexo = null, idade = null;
        try {
            stmt = ConnectionFactory.prepareStatement(cmd);
            dados = stmt.executeQuery(cmd);

            while (dados.next()) {
                nomeAluno = dados.getString(1);
                GraduacaoAlu = dados.getString(2);
                sexo = dados.getString(3);
                idade = dados.getString(4);

                results.add(aluno);

            }

        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return results;
    }
}

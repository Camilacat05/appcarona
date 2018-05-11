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
import model.bean.Aluno;
/**
 *
 * @author Alita
 */
public class AlunoDAO {
    
    public void create(Aluno al){
     Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try {
            stat = con.prepareStatement("INSERT INTO aluno(nomeAluno,GraduacaoAlu,sexo,idade)VALUES(?,?,?,?)");
            
            stat.setString(1,al.getNomeAluno());
            stat.setString(2,al.getGraduacaoAlu());
            stat.setString(3, al.getSexo());
            stat.setInt(4, al.getIdade());
            
            
            
            stat.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex); 
        }finally{
            ConnectionFactory.closeConnection(con, stat);
        }
    }
    
       
    public ArrayList<Aluno> retornaTodasAlunos(){
        String cmd = "select * from aluno order by idAluno desc;";
        ArrayList<Aluno> results = new ArrayList<Aluno>();
        Statement stmt;
        ResultSet dados = null;
        //String resultado = null;
        Aluno aluno = null;
        String nomeAluno = null, GraduacaoAlu = null,  sexo = null, idade = null;
        try{
            stmt = ConnectionFactory.prepareStatement(cmd);
            dados = stmt.executeQuery(cmd);
            
            while(dados.next()){
                nomeAluno = dados.getString(1);
                GraduacaoAlu = dados.getString(2);
                sexo = dados.getString(3);
                idade = dados.getString(4);
                
                results.add(aluno);
                
            }
           
        }catch(SQLException ex){
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE,null,ex);
        }
        return results;
}
}

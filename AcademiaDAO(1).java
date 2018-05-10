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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Academia;

/**
 *
 * @author Alita
 */
public class AcademiaDAO {
    
    public void create(Academia ac){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try {
            stat = con.prepareStatement("INSERT INTO academia(nomeAcademia,nomeProf,graduacaoProf,idade,sexo,endereco)VALUES(?,?,?,?,?,?)");
            stat.setString(1,ac.getNomeAcademia());
            stat.setString(2, ac.getNomeProf());
            stat.setString(3, ac.getGraduacaoProf());
            stat.setInt(4, ac.getIdade());
            stat.setString(5, ac.getSexo());
            stat.setString(6, ac.getEnderco());
            
            stat.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex); 
        }finally{
            ConnectionFactory.closeConnection(con, stat);
    }
    }
    
    public ArrayList<Academia> retornaTodasAcademias(){
        String cmd = "select * from academia order by idAcad desc;";
        ArrayList<Academia> results = new ArrayList<Academia>();
        Statement stmt;
        ResultSet dados = null;
        //String resultado = null;
        Academia academia = null;
        String nomeAcademia = null, nomeProf = null, graduacaoProf = null, idade = null, sexo = null, endereco = null;
        try{
            stmt = ConnectionFactory.prepareStatement(cmd);
            dados = stmt.executeQuery(cmd);
            
            while(dados.next()){
                nomeAcademia = dados.getString(1);
                nomeProf = dados.getString(2);
                graduacaoProf = dados.getString(3);
                idade = dados.getString(4);
                sexo = dados.getString(5);
                endereco = dados.getString(6);
                //academia = new Academia( nomeAcademia,  nomeProf, graduacaoProf, idade, sexo, endereco);
                results.add(academia);
                
            }
           
        }catch(SQLException ex){
            Logger.getLogger(AcademiaDAO.class.getName()).log(Level.SEVERE,null,ex);
        }
        return results;
}
    
}
 
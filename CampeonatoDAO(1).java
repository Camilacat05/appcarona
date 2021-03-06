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
    
    
     public void create(Campeonato camp){
     Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try {
            stat = con.prepareStatement("INSERT INTO campeonato(nomeCamp,ProfResp,localCamp,dataCamp,horario)VALUES(?,?,?,?,?)");
            
            stat.setString(1,camp.getNomeCamp());
            stat.setString(2,camp.getProfResp());
            stat.setString(3,camp.getLocalCamp() );
            stat.setInt(4,camp.getDataCamp());
            stat.setFloat(5, camp.getHorario());
            
            
            
            stat.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex); 
        }finally{
            ConnectionFactory.closeConnection(con, stat);
        }
    }
     
        public ArrayList<Campeonato> retornaTodosCampeonatos(){
        String cmd = "select * from campeonato order by idCamp desc;";
        ArrayList<Campeonato> results = new ArrayList<Campeonato>();
        Statement stmt;
        ResultSet dados = null;
        //String resultado = null;
        Campeonato campeonato = null;
        String nomeCamp = null, ProfResp = null,  localCamp = null, dataCamp = null, horario = null;
        try{
            stmt = ConnectionFactory.prepareStatement(cmd);
            dados = stmt.executeQuery(cmd);
            
            while(dados.next()){
                nomeCamp = dados.getString(1);
                ProfResp = dados.getString(2);
                localCamp = dados.getString(3);
                dataCamp = dados.getString(4);
                horario = dados.getString(5);
                
                results.add(campeonato);
                
            }
           
        }catch(SQLException ex){
            Logger.getLogger( CampeonatoDAO.class.getName()).log(Level.SEVERE,null,ex);
        }
        return results;
}
    
}

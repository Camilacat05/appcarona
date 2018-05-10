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
import model.bean.Inscricao;

/**
 *
 * @author Alita
 */
public class InscricaoDAO {
    
     public void create(Inscricao inc){
     Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try {
            stat = con.prepareStatement("INSERT INTO inscricao(grad,idade,peso,preco)VALUES(?,?,?,?)");
            
            stat.setString(1,inc.getGrad());
            stat.setInt(2,inc.getIdade());
            stat.setFloat(3,inc.getPeso());
            stat.setFloat(4,inc.getPreco());
            
            stat.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex); 
        }finally{
            ConnectionFactory.closeConnection(con, stat);
        }
    }
    
}

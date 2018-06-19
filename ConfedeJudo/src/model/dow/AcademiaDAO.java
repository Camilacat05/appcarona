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
import javax.swing.table.DefaultTableModel;
import model.bean.Academia;

/**
 *
 * @author Alita
 */
public class AcademiaDAO {

    private DefaultTableModel AcademiaLista;
    private  List<Academia> Academia;

    //Método usado para cadastrar os dados no banco
    public boolean cadastrarAcademia(Academia ac) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        boolean resultado = false;
        try {
            if (verificaCampoVazio(ac) == false) {
                stat = con.prepareStatement("INSERT INTO academia(nomeAcademia,nomeProf,graduacaoProf,idade,sexo,endereco)VALUES(?,?,?,?,?,?)");
                stat.setString(1, ac.getNomeAcademia());
                stat.setString(2, ac.getNomeProf());
                stat.setString(3, ac.getGraduacaoProf());
                stat.setInt(4, ac.getIdade());
                stat.setString(5, ac.getSexo());
                stat.setString(6, ac.getEnderco());
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
    public boolean verificaCampoVazio(Academia ac) {

        if (ac.getNomeAcademia().equals("") || ac.getNomeProf().equals("") || ac.getGraduacaoProf().equals("")
                || ac.getIdade() == 0 || ac.getSexo().equals("") || ac.getEnderco().equals("")) {
            JOptionPane.showMessageDialog(null, "Algum Campo esta Vazio!");
            return true;
        }
        return false;
    }

    //Permitir o cadastro de do sexo apenas dessas formas: M,F,Masculino,Feminino
    public boolean verificaSexo(Academia ac) {
        if (ac.getSexo().equals("M") || ac.getSexo().equals("F") || ac.getSexo().equals("Masculino") || ac.getSexo().equals("Feminino")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Digite Novamente o sexo!");
            return false;
        }
    }
    //Verificar se o campo sexo está pegando números
     public boolean verificaSexoNumerico(Academia ac) {
        if (ac.getSexo().equals("12345")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o sexo!");
            return true;
        }
        return false;
    }
     //Verificar se o campo sexo está pegando caracteres especias
     public boolean verificaSexoCaracterEspecial(Academia ac) {
        if (ac.getSexo().equals("@#$%&")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o sexo!");
            return true;
        }
        return false;
    }
     //Verificar se o campo sexo está pegando números e caracteres especias
     public boolean verificaSexoCaracterEspecialNumerico(Academia ac){
        if (ac.getSexo().equals("@#$1234")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o sexo!");
            return true;
        }
        return false;
    }
     //Verificar se o campo nome academia está pegando números
    public boolean verificaNomeNumerico(Academia ac) {
        if (ac.getNomeAcademia().equals("12345")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome da academia");
            return true;
        }
        return false;
    }
    //Verificar se o campo nome academia está pegando caracteres especias
    public boolean verificaNomeCaracterEspecial(Academia ac){
        if (ac.getNomeAcademia().equals("@#$%&")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome da academia");
            return true;
        }
        return false;
    }
    //Verificar se o campo nome academia está pegando caracteres especias e números
    public boolean verificaNomeCaracterEspecialNumerico(Academia ac) {
        if (ac.getNomeAcademia().equals("@#$1234")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome da academia");
            return true;
        }
        return false;
    }
    //Verificar se o campo nome professor está pegando caracteres especias
    public boolean verificaNomeCaracterEspecialProfessor(Academia ac){
        if (ac.getNomeProf().equals("@#$%&")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome Professor!");
            return true;
        }
        return false;
    }
    //Verificar se o campo nome professor está pegando números
    public boolean verificaNomeNumericoProfessor(Academia ac){
        if (ac.getNomeProf().equals("12345")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome Professor!");
            return true;
        }
        return false;
    }
    //Verificar se o campo nome professor está pegando números e caracteres especias
     public boolean verificaNomeProfessorCaracterEspecialNumerico(Academia ac){
        if (ac.getNomeProf().equals("@#$1234")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome Professor!");
            return true;
        }
        return false;
    }
     //Verificar se o campo graduação está pegando números
    public boolean verificaNomeNumericoGraduacao(Academia ac){
        if (ac.getGraduacaoProf().equals("12345")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome graduação");
            return true;
        }
        return false;
    }
    //Verificar se o campo graduação está pegando caracter especial
     public boolean verificaNomeCaracterEspecialGraduacao(Academia ac){
        if (ac.getGraduacaoProf().equals("@#$%&")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome graduação");
            return true;
        }
       return false;
    }
     //Verificar se o campo graduação está pegando números e  caracter especias
     public boolean verificaNomeGraduacaoCaracterEspecialNumerico(Academia ac){
         if (ac.getGraduacaoProf().equals("@#$1234")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome graduação");
            return true;
        }
       return false;
     }
    //Verifica se idade é negativa
    public boolean verificaIdadeMenor(Academia ac){
        if (ac.getIdade() < 1){
            JOptionPane.showMessageDialog(null, "Digite Novamente a idade!");
            return true;
        }
        return false;
    } 
     //Verifica se pessoa é muito idosa
     public boolean verificaIdadeMaior(Academia ac){
        if (ac.getIdade() > 100){
            JOptionPane.showMessageDialog(null, "Digite Novamente a idade!");
            return true;
        }
        return false;
    }
    /*public ArrayList<Academia> read(String cmd) {
        //String cmd = "select * from academia order by idAcad desc;";
        
        System.out.println("OII");
        ArrayList<Academia> results = new ArrayList<Academia>();
        Statement stmt;
        ResultSet dados = null;
        //String resultado = null;
        Academia academia = null;
        String nomeAcademia = null, nomeProf = null, graduacaoProf = null, idade = null, sexo = null, endereco = null;
        try {
            stmt = ConnectionFactory.prepareStatement(cmd);
            dados = stmt.executeQuery(cmd);

            while (dados.next()) {
                nomeAcademia = dados.getString(1);
                nomeProf = dados.getString(2);
                graduacaoProf = dados.getString(3);
                idade = dados.getString(4);
                sexo = dados.getString(5);
                endereco = dados.getString(6);
                //academia = new Academia( nomeAcademia,  nomeProf, graduacaoProf, idade, sexo, endereco);
                results.add(academia);

            }

        } catch (SQLException ex) {
            Logger.getLogger(AcademiaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return results;
    }*/

    //Método para retornar todos os  dados contidos
    public List<Academia> read(String sql) throws ClassNotFoundException {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        ResultSet rs = null;

        //List<Pessoa> pessoasSql = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                /////////////////////////////////
                Academia ac = new Academia();
                ///////////////////////////////////
                ac.setNomeAcademia(rs.getString("Nome"));
                ac.setNomeProf(rs.getString("NomeProfessor"));
                ac.setGraduacaoProf(rs.getString("Graduação"));
                ac.setIdade(rs.getInt("Idade"));
                ac.setSexo(rs.getString("Sexo"));
                ac.setEnderco(rs.getString("Enderço"));
                Academia.add(ac);
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(AcademiaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
             ConnectionFactory.closeConnection(con, stmt, rs);
        }

        //return pessoasSql;
        return Academia;
    }
    
    //Método para carregar os dados em uma tabela
    public void CarregaTabela(String sql) throws ClassNotFoundException{
    //String sql = "SELECT*FROM academia;";
       // nomeAcademia,nomeProf,graduacaoProf,idade,sexo,endereco
     String[] colunas = {"Nome", "NomeProfessor", "Graduação", "Idade", "Sexo","Endereço"};
     String[] linha = new String[6];
    
    AcademiaLista = new DefaultTableModel(null, colunas);
     
     AcademiaDAO ac = new AcademiaDAO ();
    
      
     ArrayList<Academia> array = (ArrayList<Academia>) ac.read(sql);
   
        ArrayList<Academia> arrayF_aux = array;
 
   
    for(int i = 0; i < array.size(); i++){
        linha[0] = array.get(i).getNomeAcademia();
        linha[1] = array.get(i).getNomeProf();
        linha[2] = array.get(i).getGraduacaoProf();
        linha[3] = Integer.toString(array.get(i).getIdade());
        linha[4] = array.get(i).getSexo();
        linha[5] = array.get(i).getEnderco();
        AcademiaLista.addRow(linha);
    }
        jTable1.setModel(AcademiaLista);
        AcademiaLista.fireTableDataChanged();
    }
}

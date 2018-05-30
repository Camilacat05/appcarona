
package br.test;

import junit.framework.Assert;
import model.dow.AcademiaDAO;
import model.bean.Academia;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Alita
 */
public class TestCadastroAcademia {
     
   AcademiaDAO cad; 
   Academia c;
   
   @Before
   public void setup(){
       
       cad = new AcademiaDAO();
       c = new Academia();
   }
    
   @After
   public void teardown(){
       cad = null;
   }
   
   @Test
   public void testCadastroAcademiaValido(){
       c.setNomeAcademia("Judo");
       c.setNomeProf("Julio");
       c.setGraduacaoProf("Lixo");
       c.setIdade(35);
       c.setSexo("Masculino");
       c.setEnderco("Rua perdida");
       assertTrue(cad.cadastrarAcademia(c));
   }
   
   @Test
   public void testCadastroAcademiaInvalido(){
     
     assertFalse(cad.cadastrarAcademia(c));
     
   }
   
   @Test 
   public void testCampoVazioValido(){
       assertTrue(cad.verificaCampoVazio(c));
   }
   
    @Test 
   public void testCampoVazioInvalido(){
       assertFalse(cad.verificaCampoVazio(c));
   }
   
   @Test
   public void testCampoNomeValido(){
       c.setNomeAcademia("Nova Forma");
       assertTrue(cad.verificaNome(c));
   }
   
   @Test
   public void testCampoNomeInvalido(){
       assertFalse(cad.verificaNome(c));
   }
   
   @Test
   public void testCampoSexoValido(){
       
       assertTrue(cad.verificaSexo(c));
   }
   
   @Test
   public void testCampoSexoInvalido(){
       
       assertFalse(cad.verificaSexo(c));
   }
}

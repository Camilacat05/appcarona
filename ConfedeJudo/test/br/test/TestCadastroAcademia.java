
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
   public void testCadastroAcademiaInvalido(){
     
     assertFalse(cad.cadastrarAcademia(c));
     
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
   public void testCampoVazioValido(){
       assertTrue(cad.verificaCampoVazio(c));
   }
   
    @Test 
   public void testCampoVazioInvalido(){
       assertTrue(cad.verificaCampoVazio(c));
   }
   
   @Test
   public void testCampoNomeNumericoValido(){
       c.setNomeAcademia("12345");
       assertTrue(cad.verificaNomeNumerico(c));
   }
   @Test
   public void testCampoNomeNumericoInvalido(){
       assertFalse(cad.verificaNomeNumerico(c));
   }
   @Test
   public void testverificaNomeCaracterEspecialValido(){
       c.setNomeAcademia("@#$%&");
       assertTrue(cad.verificaNomeCaracterEspecial(c));
   }
   @Test
   public void testverificaNomeCaracterEspecialInvalido(){
       assertFalse(cad.verificaNomeCaracterEspecial(c));
   }
   @Test
   public void testverificaNomeCaracterEspecialNumericoValido(){
       c.setNomeAcademia("@#$1234");
       assertTrue(cad.verificaNomeCaracterEspecialNumerico(c));
   }
    @Test
   public void testverificaNomeCaracterEspecialNumericoInvalido(){
       assertFalse(cad.verificaNomeCaracterEspecialNumerico(c));
   }
   @Test
   public void testverificaNomeNumericoProfessorValido(){
       c.setNomeProf("12345");
       assertTrue(cad.verificaNomeNumericoProfessor(c));
   }
   
   @Test
   public void testverificaNomeNumericoProfessorInvalido(){
       assertFalse(cad.verificaNomeNumericoProfessor(c));
   }
   @Test
   public void testverificaNomeCaracterEspecialProfessorValido(){
       c.setNomeProf("@#$%&");
       assertTrue(cad.verificaNomeCaracterEspecialProfessor(c));
   }
    @Test
   public void testverificaNomeCaracterEspecialProfessorInvalido(){
       assertFalse(cad.verificaNomeCaracterEspecialProfessor(c));
   }
   @Test
   public void testverificaNomeProfessorCaracterEspecialNumericoValido(){
       c.setNomeProf("@#$1234");
       assertTrue(cad.verificaNomeProfessorCaracterEspecialNumerico(c));
   }
   @Test
   public void testverificaNomeProfessorCaracterEspecialNumericoInvalido(){
       assertFalse(cad.verificaNomeProfessorCaracterEspecialNumerico(c));
   }
   @Test
   public void testverificaNomeNumericoGraduacaoValido(){
       c.setGraduacaoProf("12345");
       assertTrue(cad.verificaNomeNumericoGraduacao(c));
   }
   @Test
   public void testverificaNomeNumericoGraduacaoInvalido(){
       assertFalse(cad.verificaNomeNumericoGraduacao(c));
   }
    @Test
    public void testverificaNomeCaracterEspecialGraduacaoValido(){
        c.setGraduacaoProf("@#$%&");
        assertTrue(cad.verificaNomeCaracterEspecialGraduacao(c));
    }
    @Test
    public void testverificaNomeCaracterEspecialGraduacaoInvalido(){
        assertFalse(cad.verificaNomeCaracterEspecialGraduacao(c));
    }
    @Test
    public void testverificaNomeGraduacaoCaracterEspecialNumericoValido(){
        c.setGraduacaoProf("@#$1234");
        assertTrue(cad.verificaNomeGraduacaoCaracterEspecialNumerico(c));
    }
    @Test
    public void testverificaNomeGraduacaoCaracterEspecialNumericoInvalido(){
        assertFalse(cad.verificaNomeGraduacaoCaracterEspecialNumerico(c));
    }
   @Test
   public void testCampoSexoValido(){
       c.setSexo("Feminino");
       assertTrue(cad.verificaSexo(c));
   }
   @Test
   public void testCampoSexoInvalido(){
       
       assertFalse(cad.verificaSexo(c));
   }
   @Test
   public void testverificaSexoNumericoValido(){
       c.setSexo("12345");
       assertTrue(cad.verificaSexoNumerico(c));
   }
    @Test
    public void testverificaSexoNumericoInvalido(){
        assertFalse(cad.verificaSexoNumerico(c));
    }
   @Test
   public void testverificaSexoCaracterEspecialValido(){
       c.setSexo("@#$%&");
       assertTrue(cad.verificaSexoCaracterEspecial(c));
   }
   @Test
   public void testverificaSexoCaracterEspecialInvalido(){
       assertFalse(cad.verificaSexoCaracterEspecial(c));
   }
   @Test
   public void testverificaSexoCaracterEspecialNumericoValido(){
       c.setSexo("@#$1234");
       assertTrue(cad.verificaSexoCaracterEspecialNumerico(c));
   }
   @Test
   public void testverificaSexoCaracterEspecialNumericoInvalido(){
       assertFalse(cad.verificaSexoCaracterEspecialNumerico(c));
   }
    @Test
    public void testverificaIdadeMenorValido(){
       c.setIdade(0);
       assertTrue(cad.verificaIdadeMenor(c));
   }
   @Test
    public void testverificaIdadeMenorInvalido(){
        assertFalse(cad.verificaIdadeMenor(c));
    }
    @Test
    public void testverificaIdadeMaiorValido(){
       c.setIdade(100);
       assertTrue(cad.verificaIdadeMaior(c));
   }
    @Test
    public void testverificaIdadeMaiorInvalido(){
       assertFalse(cad.verificaIdadeMaior(c));
   }
}

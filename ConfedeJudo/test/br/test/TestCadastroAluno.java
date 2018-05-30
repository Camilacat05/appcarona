
package br.test;


import model.bean.Aluno;
import model.dow.AlunoDAO;
import org.junit.After;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Alita
 */
public class TestCadastroAluno {
    
    Aluno al;
    AlunoDAO alu;
   
   @Before
   public void setup(){
       
     al = new Aluno();
     alu = new AlunoDAO();
     
   }
    
   @After
   public void teardown(){
       alu = null;
   }
   
   @Test
   public void testCadastroInvalidoAluno(){
       assertFalse(alu.cadastrarAluno(al));
   }
   
   @Test
   public void testCadastroValidoAluno(){
       al.setNomeAluno("Charles Anao");
       al.setGraduacaoAlu("MiniGraduacao");
       al.setSexo("M");
       al.setIdade(110);
       assertTrue(alu.cadastrarAluno(al));
   }
   
      @Test 
   public void testCampoVazioValido(){
       assertTrue(alu.verificaCampoVazio(al));
   }
   
    @Test 
   public void testCampoVazioInvalido(){
       assertFalse(alu.verificaCampoVazio(al));
   }
   
   @Test
   public void testCampoNomeValido(){
       al.setNomeAluno("Julia Maria Martins");
       assertTrue(alu.verificaNome(al));
   }
   
   @Test
   public void testCampoNomeInvalido(){
       assertFalse(alu.verificaNome(al));
   }
   
     @Test
   public void testCampoSexoValido(){
       
       assertTrue(alu.verificaSexo(al));
   }
   
   @Test
   public void testCampoSexoInvalido(){
       
       assertFalse(alu.verificaSexo(al));
   }
   @Test
   public void testIdadeValida(){
       assertTrue(alu.verificaIdade(al));
   }
   
   @Test
   public void testIdadeInvalida(){
       assertFalse(alu.verificaIdade(al));
   }
}


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
   public void testCampoNomeNumericoValidoAluno(){
       al.setNomeAluno("12345");
       assertTrue(alu.verificaNomeNumericoAluno(al));
   }
   
   @Test
   public void testCampoNomeNumericoInvalidoAluno(){
       assertFalse(alu.verificaNomeNumericoAluno(al));
   }
   @Test
   public void testverificaNomeCaractereEspecialValidoAluno(){
       al.setNomeAluno("@&*%$");
       assertTrue(alu.verificaNomeCaractereEspecialAluno(al));
   }
   
   @Test
   public void testverificaNomeCaractereEspecialInvalidoAluno(){
       assertFalse(alu.verificaNomeCaractereEspecialAluno(al));
   }
   
    @Test
    public void testverificaNomeAlunoCaractereEspecialNumericoValido(){
       al.setNomeAluno("@#$1234");
       assertTrue(alu.verificaNomeAlunoCaracterEspecialNumerico(al));
   }
    @Test
    public void testverificaNomeAlunoCaractereEspecialNumericoInvalido(){
        assertFalse(alu.verificaNomeAlunoCaracterEspecialNumerico(al));
    }
   @Test
   public void testverificaNomeCaractereEspecialValidoGraduacao(){
       al.setGraduacaoAlu("@#$%&");
       assertTrue(alu.verificaNomeCaractereEspecialGraduacao(al));
   }
   @Test
   public void testverificaNomeCaractereEspecialInvalidoGraduacao(){
       assertFalse(alu.verificaNomeCaractereEspecialGraduacao(al));
   }
   @Test
   public void testverificaNomeNumericoGraduacaoValido(){
       al.setGraduacaoAlu("12345");
       assertTrue(alu.verificaNomeNumericoGraduacao(al));
   }
   @Test
   public void testverificaNomeNumericoGraduacaoInvalido(){
       assertFalse(alu.verificaNomeNumericoGraduacao(al));
   }
    @Test
    public void testverificaNomeGraduacaoCaractereEspecialNumericoValido(){
       al.setGraduacaoAlu("@#$1234");
       assertTrue(alu.verificaNomeGraduacaoCaracterEspecialNumerico(al));
   }
    @Test
    public void testverificaNomeGraduacaoCaractereEspecialNumericoInvalido(){
        assertFalse(alu.verificaNomeGraduacaoCaracterEspecialNumerico(al));
    }
   @Test
    public void testCampoSexoValido(){
       al.setSexo("Feminino");
       assertTrue(alu.verificaSexo(al));
   }
   
   @Test
   public void testCampoSexoInvalido(){
       
       assertFalse(alu.verificaSexo(al));
   }
   @Test
    public void testCampoSexoNumericoValido(){
       al.setSexo("12345");
       assertTrue(alu.verificaSexoNumerico(al));
   }
   @Test
    public void testCampoSexoNumericoInvalido(){
       assertFalse(alu.verificaSexoNumerico(al));
   }
   @Test
   public void testCampoSexoCaractereEspecialValido(){
       al.setSexo("@#$%&");
       assertTrue(alu.verificaSexoCaractereEspecial(al));
   }
   @Test
   public void testCampoSexoCaractereEspecialInvalido(){
       assertFalse(alu.verificaSexoCaractereEspecial(al));
   }
    @Test
   public void testverificaSexoCaracterEspecialNumericoValido(){
       al.setSexo("@#$1234");
       assertTrue(alu.verificaSexoCaracterEspecialNumerico(al));
   }
   @Test
   public void testverificaSexoCaracterEspecialNumericoInvalido(){
       assertFalse(alu.verificaSexoCaracterEspecialNumerico(al));
   }
   @Test
   public void testIdadeNumeroNegativoValida(){
       al.setIdade(-12);
       assertFalse(alu.verificaIdadeMenor(al));  
   }
   
   @Test
   public void testIdadeNumeroNegativoInvalida(){
       assertTrue(alu.verificaIdadeMenor(al));
   }
   @Test
   public void testIdade3DigitosValida(){
       al.setIdade(100);
       assertTrue(alu.verificaIdadeMaior(al));
   }
   
   @Test
   public void testIdade3DigitosInvalida(){
       assertFalse(alu.verificaIdadeMaior(al));
   }
}

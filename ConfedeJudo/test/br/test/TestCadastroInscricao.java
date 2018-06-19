package br.test;

import model.bean.Inscricao;
import model.dow.InscricaoDAO;
import org.junit.After;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Alita
 */
public class TestCadastroInscricao {
    
    
    InscricaoDAO inc;
    Inscricao in;
    
     @Before
    public void setup(){
       
       inc = new InscricaoDAO ();
       in = new Inscricao();
    }
    
    @After
   public void teardown(){
       inc = null;
   }
   
   @Test
   public void testCadastroInscricaoValido(){
       in.setNomeCamp("Judorama");
       in.setNomeAtleta("Carlos");
       in.setGrad("Roxa");
       in.setIdade(13);
       in.setPeso((float) 45.6);
       in.setPreco((float) 25.00);
       assertTrue(inc.cadastrarInscricao(in));
   }
   @Test
   public void testCadastroInscricaoInvalido(){
       assertFalse(inc.cadastrarInscricao(in));
       
   }
    @Test
   public void testverificaNomeAtletaNumericoValido(){
       in.setNomeAtleta("12345");
       assertTrue(inc.verificaNomeAtletaNumerico(in));
   }
   @Test
   public void testverificaNomeAtletaNumericoInvalido(){
       assertFalse(inc.verificaNomeAtletaNumerico(in));
   }
   @Test
   public void testverificaNomeAtletaCaracterEspecialValido(){
       in.setNomeAtleta("@#$%&*");
       assertTrue(inc.verificaNomeAtletaCaracterEspecial(in));
   }
   @Test
   public void testverificaNomeAtletaCaracterEspecialInvalido(){
       assertFalse(inc.verificaNomeAtletaCaracterEspecial(in));
   }
   @Test
   public void testverificaNomeAtletaCaracterEspecialNumericoValido(){
       in.setNomeAtleta("@#$123");
       assertTrue(inc.verificaNomeAtletaCaracterEspecialNumerico(in));
   }
   @Test
   public void testverificaNomeAtletaCaracterEspecialNumericoInvalido(){
       assertFalse(inc.verificaNomeAtletaCaracterEspecialNumerico(in));
   }
   @Test
   public void testverificaNomeCampNumericoValido(){
       in.setNomeCamp("12345");
       assertTrue(inc.verificaNomeCampNumerico(in));
   }
   @Test
   public void testverificaNomeCampNumericoInvalido(){
       assertFalse(inc.verificaNomeCampNumerico(in));
   }
   @Test
   public void testverificaNomeCampCaracterEspecialValido(){
       in.setNomeCamp("@#$%&*");
       assertTrue(inc.verificaNomeCampCaracterEspecial(in));
   }
   @Test
   public void testverificaNomeCampCaracterEspecialInvalido(){
       assertFalse(inc.verificaNomeCampCaracterEspecial(in));
   }
   @Test
   public void testverificaNomeCampCaracterEspecialNumericoValido(){
       in.setNomeCamp("@#$123");
       assertTrue(inc.verificaNomeCampCaracterEspecialNumerico(in));
   }
   @Test
   public void testverificaNomeCampCaracterEspecialNumericoInvalido(){
       assertFalse(inc.verificaNomeCampCaracterEspecialNumerico(in));
   }
   @Test
   public void testverificaNomeGraduacaoNumericoValido(){
       in.setGrad("12345");
       assertTrue(inc.verificaNomeGraduacaoNumerico(in));
   }
   @Test
   public void testverificaNomeGraduacaoNumericoInvalido(){
       assertFalse(inc.verificaNomeGraduacaoNumerico(in));
   }
   @Test
   public void testverificaNomeGraduacaoCaracterEspecialValido(){
       in.setGrad("@#$%&*");
       assertTrue(inc.verificaNomeGraduacaoCaracterEspecial(in));
   }
   @Test
   public void testverificaNomeGraduacaoCaracterEspecialInvalido(){
      assertFalse(inc.verificaNomeGraduacaoCaracterEspecial(in)); 
   }
   @Test
   public void testverificaNomeGraduacaoCaracterEspecialNumericoValido(){
       in.setGrad("@#$123");
       assertTrue(inc.verificaNomeGraduacaoCaracterEspecialNumerico(in));
   }
    @Test
   public void testverificaNomeGraduacaoCaracterEspecialNumericoInvalido(){
      assertFalse(inc.verificaNomeGraduacaoCaracterEspecialNumerico(in)); 
   }
   @Test
   public void testverificaNomeIdadeMenorValido(){
       in.setIdade(-3);
       assertTrue(inc.verificaNomeIdadeMenor(in));
   }
   @Test
   public void testverificaNomeIdadeMenorInvalido(){
       assertFalse(inc.verificaNomeIdadeMenor(in));
   }
   @Test
   public void testverificaNomeIdadeMaiorValido(){
       in.setIdade(99);
       assertTrue(inc.verificaNomeIdadeMaior(in));
   }
   @Test
   public void testverificaNomeIdadeMaiorInvalido(){
       assertFalse(inc.verificaNomeIdadeMaior(in));
   }
   @Test
   public void testverificaPrecoMenorValido(){
       in.setPreco((float)-3.5);
       assertTrue(inc.verificaPrecoMenor(in));
   }
   @Test
   public void testverificaPrecoMenorInvalido(){
      assertFalse(inc.verificaPrecoMenor(in)); 
   }
   @Test
   public void testverificaPesoMenorValido(){
       in.setPeso((float) -4.5);
       assertTrue(inc.verificaPesoMenor(in));
   }
   @Test
   public void testverificaPesoMenorInvalido(){
       assertFalse(inc.verificaPesoMenor(in));
   } 
}

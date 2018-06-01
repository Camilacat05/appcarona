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
 * @author Luis Guilherme
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
       in.setGrad("Roxa");
       in.setIdade(13);
       in.setPeso((float) 45.6);
       in.setPreco((float) 25.00);
       assertTrue(inc.cadastrarInscricao(in));
   }
   
   public void testCadastroInscricaoInvalido(){
       assertFalse(inc.cadastrarInscricao(in));
       
   }
}

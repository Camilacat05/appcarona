
package br.test;

import model.bean.Campeonato;
import model.dow.CampeonatoDAO;
import org.junit.After;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Luis Guilherme
 */
public class TestCadastroCampeonato {
    
    CampeonatoDAO camp; 
    Campeonato cp;
   
   @Before
   public void setup(){
       
       camp = new CampeonatoDAO ();
       cp = new Campeonato();
   }
    
   @After
   public void teardown(){
       camp = null;
   }
   @Test
   public void testCastroCampeonatoValido(){
       cp.setNomeCamp("Combate");
       cp.setProfResp("Gilberto");
       cp.setLocalCamp("Avenida Grande");
       cp.setDataCamp(20180324);
       cp.setHorario(00001000);
       
       assertTrue(camp.cadastrarCampeonato(cp));
   }
   
   @Test
   public void testCastroCampeonatoInvalido(){
       assertFalse(camp.cadastrarCampeonato(cp));
   }
   
   public void testCampoVazioValido(){
       assertFalse(camp.verificaCampoVazio(cp));
   }
   
    @Test 
   public void testCampoVazioInvalido(){
       assertTrue(camp.verificaCampoVazio(cp));
   }
   @Test
   public void testCampoNomeValido(){
       cp.setNomeCamp("Judo nova fase");
       assertTrue(camp.verificaNome(cp));
   }
   
   @Test
   public void testCampoNomeInvalido(){
       
       assertFalse(camp.verificaNome(cp));
   }
   
}

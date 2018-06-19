
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
 * @author Alita
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
   public void testCadastroCampeonatoValido(){
       cp.setNomeCamp("Combate");
       cp.setProfResp("Gilberto");
       cp.setLocalCamp("Avenida Grande");
       cp.setDataCamp(20180324);
       cp.setHorario(100000);
       
       assertTrue(camp.cadastrarCampeonato(cp));
   }
   
   @Test
   public void testCadastroCampeonatoInvalido(){
       assertFalse(camp.cadastrarCampeonato(cp));
   }
   
   public void testCampoVazioValido(){
       assertTrue(camp.verificaCampoVazio(cp));
   }
   
    @Test 
   public void testCampoVazioInvalido(){
       cp.setNomeCamp("");
       assertTrue(camp.verificaCampoVazio(cp));
   }
   
   @Test
   public void testCampoNomeNumericoValido(){
       cp.setNomeCamp("12345");
       assertTrue(camp.verificaNomeNumerico(cp));
   }
   
   @Test
   public void testCampoNomeNumericoInvalido(){
       
       assertFalse(camp.verificaNomeNumerico(cp));
   }
    @Test
   public void testverificaNomeCaracterEspecialValido(){
       cp.setNomeCamp("@#$%&*");
       assertTrue(camp.verificaNomeCaracterEspecial(cp));
   }
   @Test
   public void testverificaNomeCaracterEspecialInvalido(){
      assertFalse(camp.verificaNomeCaracterEspecial(cp));
   }
   @Test
   public void testverificaNomeCaracterEspecialNumericoValido(){
       cp.setNomeCamp("123$%&*");
       assertTrue(camp.verificaNomeCaracterEspecialNumerico(cp));
   }
   @Test
   public void testverificaNomeCaracterEspecialNumericoInvalido(){
       assertFalse(camp.verificaNomeCaracterEspecialNumerico(cp));
   }
   @Test
   public void testverificaNomeProfCaracterEspecialValido(){
       cp.setProfResp("@#$%&*");
       assertTrue(camp.verificaNomeProfCaracterEspecial(cp));
   }
   @Test
   public void testverificaNomeProfCaracterEspecialInvalido(){
       assertFalse(camp.verificaNomeProfCaracterEspecial(cp));
   }
   @Test
   public void testverificaNomeProfNumericoValido(){
       cp.setProfResp("12345");
       assertTrue(camp.verificaNomeProfNumerico(cp));
   }
   @Test
   public void testverificaNomeProfNumericoInvalido(){
       assertFalse(camp.verificaNomeProfNumerico(cp));
   }
   @Test
   public void testverificaNomeProfCaracterEspecialNumericoValido(){
       cp.setProfResp("@#$123");
       assertTrue(camp.verificaNomeProfCaracterEspecialNumerico(cp));
   }
   @Test
   public void testverificaNomeProfCaracterEspecialNumericoInvalido(){
       assertFalse(camp.verificaNomeProfCaracterEspecialNumerico(cp));
   }
   @Test
   public void testverificaNomeLocalCampNumericoValido(){
       cp.setLocalCamp("12345");
       assertTrue(camp.verificaNomeLocalCampNumerico(cp));
   }
   @Test
   public void testverificaNomeLocalCampNumericoInvalido(){
       assertFalse(camp.verificaNomeLocalCampNumerico(cp));
   }
   @Test
   public void testverificaNomeLocalCampCaracterEspecialValido(){
       cp.setLocalCamp("@#$%&*");
       assertTrue(camp.verificaNomeLocalCampCaracterEspecial(cp));
   }
   @Test
   public void testverificaNomeLocalCampCaracterEspecialInvalido(){
       assertFalse(camp.verificaNomeLocalCampCaracterEspecial(cp));
   }
   @Test
   public void testverificaNomeLocalCampCaracterEspecialNumericoValido(){
       cp.setLocalCamp("@#$123");
       assertTrue(camp.verificaNomeLocalCampCaracterEspecialNumerico(cp));
   }
   @Test
   public void testverificaNomeLocalCampCaracterEspecialNumericoInvalido(){
       assertFalse(camp.verificaNomeLocalCampCaracterEspecialNumerico(cp));
   }
   @Test
   public void testverificaNomeDataValido(){
       cp.setDataCamp(0);
       assertTrue(camp.verificaNomeData(cp));
   }
   @Test
   public void testverificaNomeDataInvalido(){
      assertFalse(camp.verificaNomeData(cp));
   }
   @Test
   public void testverificaNomeHorarioMenorValido(){
       cp.setHorario(-3);
       assertTrue(camp.verificaNomeHorarioMenor(cp));
   }
   @Test
   public void testverificaNomeHorarioMenorInvalido(){
       assertFalse(camp.verificaNomeHorarioMenor(cp));
   }
   @Test
   public void testverificaNomeHorarioMaiorValido(){
       cp.setHorario(10);
       assertTrue(camp.verificaNomeHorarioMaior(cp));
   }
   @Test
   public void testverificaNomeHorarioMaiorInvalido(){
      assertFalse(camp.verificaNomeHorarioMaior(cp)); 
   }
}

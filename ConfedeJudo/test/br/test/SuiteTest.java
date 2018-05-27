
package br.test;


/**
 *
 * @author Alita
 */

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

 @RunWith(Suite.class)
 @Suite.SuiteClasses({
   TestCadastroAcademia.class,
   TestCadastroAluno.class,
   TestCadastroCampeonato.class,
   TestCadastroInscricao.class
})
public class SuiteTest {
       
}

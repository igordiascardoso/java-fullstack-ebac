package java.br.com.idias.dao.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author idias
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ClienteDAOTest.class,
        ProdutoServiceTest.class, ProdutoDAOTest.class,
        VendaDAOTest.class})
public class AllTests {

}

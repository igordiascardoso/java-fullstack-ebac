package java.br.com.idias.dao.test;

import br.com.idias.Domain.Produto;
import br.com.idias.dao.IProdutoDAO;
import br.com.idias.exceptions.DAOException;
import br.com.idias.exceptions.MaisDeUmRegistroException;
import br.com.idias.exceptions.TableException;
import br.com.idias.exceptions.TipoChaveNaoEncontradaException;
import br.com.idias.services.IProdutoService;
import br.com.idias.services.ProdutoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.br.com.idias.dao.dao.ProdutoDaoMock;

import java.math.BigDecimal;

/**
 * @author idias
 */
public class ProdutoServiceTest {

    private IProdutoService produtoService;

    private Produto produto;

    public ProdutoServiceTest() {
        IProdutoDAO dao = new ProdutoDaoMock();
        produtoService = new ProdutoService(dao);
    }

    @Before
    public void init() {
        produto = new Produto();
        produto.setCodigo("A1");
        produto.setDescricao("Produto 1");
        produto.setNome("Produto 1");
        produto.setValor(BigDecimal.TEN);
    }

    @Test
    public void pesquisar() throws DAOException, MaisDeUmRegistroException, TableException {
        Produto produtor = this.produtoService.consultar(produto.getCodigo());
        Assert.assertNotNull(produtor);
    }

    @Test
    public void salvar() throws TipoChaveNaoEncontradaException, DAOException {
        Boolean retorno = produtoService.cadastrar(produto);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluir() throws DAOException {
        produtoService.excluir(produto.getCodigo());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
        produto.setNome("Rodrigo Pires");
        produtoService.alterar(produto);

        Assert.assertEquals("Rodrigo Pires", produto.getNome());
    }
}

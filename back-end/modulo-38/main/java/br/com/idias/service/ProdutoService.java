package br.com.idias.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.idias.dao.IProdutoDAO;
import br.com.idias.domain.Produto;
import br.com.idias.services.generic.GenericService;

/**
 * @author idias
 */
@Stateless
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {
	
	private IProdutoDAO produtoDao;

	@Inject
	public ProdutoService(IProdutoDAO produtoDao) {
		super(produtoDao);
		this.produtoDao = produtoDao;
	}

	@Override
	public List<Produto> filtrarProdutos(String query) {
		return produtoDao.filtrarProdutos(query);
	}

}

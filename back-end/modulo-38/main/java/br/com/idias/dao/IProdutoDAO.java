package br.com.idias.dao;

import java.util.List;

import br.com.idias.dao.generic.IGenericDAO;
import br.com.idias.domain.Produto;

/**
 * @author idias
 */
public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}

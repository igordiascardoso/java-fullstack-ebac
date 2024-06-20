package br.com.idias.service;

import java.util.List;

import br.com.idias.domain.Produto;
import br.com.idias.services.generic.IGenericService;

/**
 * @author idias
 */
public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}

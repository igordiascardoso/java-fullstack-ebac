 
package br.com.idias.services;

import br.com.idias.dao.IProdutoDAO;
import br.com.idias.domain.Produto;
import br.com.idias.services.generic.GenericService;

 
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}

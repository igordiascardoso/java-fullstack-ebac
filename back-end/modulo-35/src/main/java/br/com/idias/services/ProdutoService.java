package br.com.idias.services;

import br.com.idias.Domain.Produto;
import br.com.idias.dao.IProdutoDAO;
import br.com.idias.services.generic.GenericService;

/**
 * @author idias
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}

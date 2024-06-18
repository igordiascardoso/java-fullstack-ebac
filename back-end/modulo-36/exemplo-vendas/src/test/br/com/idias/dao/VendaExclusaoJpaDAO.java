package br.com.idias.dao;

import br.com.idias.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.idias.dao.jpa.IVendaJpaDAO;
import br.com.idias.domain.jpa.VendaJpa;
import br.com.idias.exceptions.DAOException;
import br.com.idias.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author idias
 *
 * Classe utilizada somente no teste para fazer a exclusão das vendas
 *
 */
public class VendaExclusaoJpaDAO extends GenericJpaDB1DAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}

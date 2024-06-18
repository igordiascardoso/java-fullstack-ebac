package br.com.idias.dao.Jpa;

import br.com.idias.Domain.Jpa.VendaJpa;
import br.com.idias.exceptions.DAOException;
import br.com.idias.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author idias
 */
public interface IVendaJpaDAO extends IGenericJapDAO<VendaJpa, Long>{

    public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    public VendaJpa consultarComCollection(Long id);
}


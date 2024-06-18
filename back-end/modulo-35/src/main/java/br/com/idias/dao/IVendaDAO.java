package br.com.idias.dao;

import br.com.idias.Domain.Venda;
import br.com.idias.dao.generic.IGenericDAO;
import br.com.idias.exceptions.DAOException;
import br.com.idias.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author idias
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}

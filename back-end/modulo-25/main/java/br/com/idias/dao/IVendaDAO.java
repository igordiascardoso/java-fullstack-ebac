
package br.com.idias.dao;

import br.com.idias.dao.generic.IGenericDAO;
import br.com.idias.domain.Venda;
import br.com.idias.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}

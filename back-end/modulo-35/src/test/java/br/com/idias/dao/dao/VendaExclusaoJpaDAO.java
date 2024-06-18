package java.br.com.idias.dao.dao;

import br.com.idias.Domain.Jpa.VendaJpa;
import br.com.idias.dao.Jpa.IVendaJpaDAO;
import br.com.idias.dao.generic.jpa.GenericJpaDAO;
import br.com.idias.exceptions.DAOException;
import br.com.idias.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author idias
 */
public class VendaExclusaoJpaDAO extends GenericJpaDAO<VendaJpa, Long> implements IVendaJpaDAO {

    public VendaExclusaoJpaDAO() {
        super(VendaJpa.class, "Postgre1");
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


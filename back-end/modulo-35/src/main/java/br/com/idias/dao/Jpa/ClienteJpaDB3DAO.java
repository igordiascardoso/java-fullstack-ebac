package br.com.idias.dao.Jpa;

import br.com.idias.Domain.Jpa.ClienteJpa;
import br.com.idias.Domain.Jpa.ClienteJpa2;
import br.com.idias.exceptions.DAOException;
import br.com.idias.exceptions.MaisDeUmRegistroException;
import br.com.idias.exceptions.TableException;
import br.com.idias.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

/**
 * @author idias
 */
public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

    public ClienteJpaDB3DAO() {
        super(ClienteJpa2.class);
    }

    @Override
    public ClienteJpa cadastrar(ClienteJpa entity) throws TipoChaveNaoEncontradaException, DAOException {
        return null;
    }

    @Override
    public void excluir(ClienteJpa entity) throws DAOException {

    }

    @Override
    public ClienteJpa alterar(ClienteJpa entity) throws TipoChaveNaoEncontradaException, DAOException {
        return null;
    }

    @Override
    public ClienteJpa consultar(Long id) throws MaisDeUmRegistroException, TableException, DAOException {
        return null;
    }

    @Override
    public Collection<ClienteJpa> buscarTodos() throws DAOException {
        return null;
    }
}

package br.com.idias.dao.Jpa;

import br.com.idias.Domain.Jpa.ClienteJpa;
import br.com.idias.dao.generic.GenericJpaDB2DAO;

/**
 * @author idias
 */
public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDB2DAO() {
        super(ClienteJpa.class);
    }
}

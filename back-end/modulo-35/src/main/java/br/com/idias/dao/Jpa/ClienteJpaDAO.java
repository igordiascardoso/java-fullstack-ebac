package br.com.idias.dao.Jpa;

import br.com.idias.Domain.Jpa.ClienteJpa;
import br.com.idias.dao.generic.jpa.GenericJpaDAO;

/**
 * @author idias
 */
public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO<C> {

    public ClienteJpaDAO() {
        super();
    }

}

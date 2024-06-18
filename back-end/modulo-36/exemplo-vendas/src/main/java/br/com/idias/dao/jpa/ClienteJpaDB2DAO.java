package br.com.idias.dao.jpa;

import br.com.idias.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.idias.domain.jpa.ClienteJpa;

/**
 * @author idias
 *
 */
public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}

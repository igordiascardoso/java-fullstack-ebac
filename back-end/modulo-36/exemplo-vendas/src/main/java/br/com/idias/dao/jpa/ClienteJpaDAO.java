package br.com.idias.dao.jpa;

import br.com.idias.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.idias.domain.jpa.ClienteJpa;

/**
 * @author idias
 *
 */
public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}

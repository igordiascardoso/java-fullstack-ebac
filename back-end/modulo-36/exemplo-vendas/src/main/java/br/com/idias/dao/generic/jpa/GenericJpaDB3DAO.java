package br.com.idias.dao.generic.jpa;

import br.com.idias.domain.jpa.Persistente;

import java.io.Serializable;

/**
 * @author idias
 *
 */
public abstract class GenericJpaDB3DAO <T extends Persistente, E extends Serializable>
	extends GenericJpaDAO<T,E> {

	public GenericJpaDB3DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Mysql1");
	}

}

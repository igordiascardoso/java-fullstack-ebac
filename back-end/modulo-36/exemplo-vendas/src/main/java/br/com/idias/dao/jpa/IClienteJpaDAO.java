package br.com.idias.dao.jpa;

import br.com.idias.dao.generic.jpa.IGenericJapDAO;
import br.com.idias.domain.jpa.Persistente;

/**
 * @author idias
 *
 */
public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}

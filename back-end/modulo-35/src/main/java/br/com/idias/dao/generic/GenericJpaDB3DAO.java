package br.com.idias.dao.generic;

import br.com.idias.dao.Jpa.Persistente;
import br.com.idias.dao.generic.jpa.GenericJpaDAO;

import java.io.Serializable;

 
public abstract class GenericJpaDB3DAO <T extends Persistente, E extends Serializable>
        extends GenericJpaDAO<T,E> {

    public GenericJpaDB3DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Mysql1");
    }

}

package br.com.idias.dao.generic;

import br.com.idias.dao.Jpa.Persistente;
import br.com.idias.dao.generic.jpa.GenericJpaDAO;

import java.io.Serializable;

 
public abstract class GenericJpaDB1DAO <T extends Persistente, E extends Serializable>
        extends GenericJpaDAO<T,E> {

    public GenericJpaDB1DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Postgre1");
    }

}

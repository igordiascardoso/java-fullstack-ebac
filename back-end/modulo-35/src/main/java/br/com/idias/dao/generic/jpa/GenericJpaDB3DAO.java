package br.com.idias.dao.generic.jpa;

import br.com.idias.dao.Jpa.Persistente;

import java.io.Serializable;

 
public abstract class GenericJpaDB3DAO <T extends Persistente, E extends Serializable>
        extends GenericJpaDAO<T,E> {

    public GenericJpaDB3DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Mysql1");
    }

}
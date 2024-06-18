package br.com.idias.dao.Jpa;

import br.com.idias.Domain.Jpa.ProdutoJpa;
import br.com.idias.dao.generic.jpa.GenericJpaDAO;

 
public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class, "Postgre1");
    }

}


package br.com.idias.dao.jpa;

import br.com.idias.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.idias.domain.jpa.ProdutoJpa;

/**
 * @author idias
 *
 */
public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}

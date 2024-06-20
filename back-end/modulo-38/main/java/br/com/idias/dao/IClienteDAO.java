package br.com.idias.dao;

import java.util.List;

import br.com.idias.dao.generic.IGenericDAO;
import br.com.idias.domain.Cliente;

/**
 * @author idias
 */
public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}

package br.com.idias.service;

import java.util.List;

import br.com.idias.domain.Cliente;
import br.com.idias.exceptions.DAOException;
import br.com.idias.services.generic.IGenericService;

/**
 * @author idias
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}

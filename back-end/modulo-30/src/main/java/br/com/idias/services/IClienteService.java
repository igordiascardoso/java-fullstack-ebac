package br.com.idias.services;

import br.com.idias.domain.Cliente;
import br.com.idias.exceptions.DAOException;
import br.com.idias.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {
	Cliente buscarPorCPF(Long cpf) throws DAOException;
}

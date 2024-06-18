package br.com.idias.services;


import br.com.idias.Domain.Cliente;
import br.com.idias.exceptions.DAOException;
import br.com.idias.services.generic.IGenericService;

/**
 * @author idias
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

    //	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
    Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
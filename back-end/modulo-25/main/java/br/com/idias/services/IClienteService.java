 
package br.com.idias.services;

import br.com.idias.domain.Cliente;
import br.com.idias.exceptions.TipoChaveNaoEncontradaException;
 
public interface IClienteService {

	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}

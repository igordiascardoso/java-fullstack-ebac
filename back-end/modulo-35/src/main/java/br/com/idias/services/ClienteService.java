package br.com.idias.services;

import br.com.idias.Domain.Cliente;
import br.com.idias.dao.IClienteDAO;
import br.com.idias.exceptions.DAOException;
import br.com.idias.exceptions.MaisDeUmRegistroException;
import br.com.idias.exceptions.TableException;
import br.com.idias.services.generic.GenericService;

/**
 * @author idias
 */
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    //private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
    }

//	@Override
//	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
//		return clienteDAO.cadastrar(cliente);
//	}

    @Override
    public Cliente buscarPorCPF(Long cpf) throws DAOException {
        try {
            return this.dao.consultar(cpf);
        } catch (MaisDeUmRegistroException | TableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

}

package com.idias.vendas.online.usecase;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.idias.vendas.online.domain.Cliente;
import com.idias.vendas.online.repository.IClienteRepository;

@Service
public class CadastroCliente {

	private IClienteRepository clienteRepository;

	public CadastroCliente(IClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public Cliente cadastrar(@Valid Cliente cliente) {
		return clienteRepository.insert(cliente);
	}
	
	public  Cliente atualizar(@Valid Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public void remover(String id) {
		clienteRepository.deleteById(id);
	}
}

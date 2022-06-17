package com.idat.tarea.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.idat.tarea.dto.ClienteDTORequest;
import com.idat.tarea.dto.ClienteDTOResponse;
import com.idat.tarea.model.Cliente;
import com.idat.tarea.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	
	@Autowired
	public ClienteRepository  clienteRepository;
	
	
	@Override
	public void guardarCliente(ClienteDTORequest cliente) {
		
		Cliente c =new Cliente();
		c.setIdCliente(cliente.getIdClienteDTO());
		c.setNombre(cliente.getNombreDTO());
		c.setDireccion(cliente.getDireccionDTO());
		c.setDni(cliente.getDniDTO());
		
		clienteRepository.save(c);
		
		
	}

	@Override
	public void editarCliente(ClienteDTORequest cliente) {
		Cliente c =new Cliente();
		c.setIdCliente(cliente.getIdClienteDTO());
		c.setNombre(cliente.getNombreDTO());
		c.setDireccion(cliente.getDireccionDTO());
		c.setDni(cliente.getDniDTO());
		
		clienteRepository.saveAndFlush(c);
	}

	@Override
	public void eliminarCliente(Integer id) {
		clienteRepository.deleteById(id);
		
	}

	@Override
	public List<ClienteDTOResponse> listarClientes() {
	
		List<ClienteDTOResponse> lista = new ArrayList<ClienteDTOResponse>();
		ClienteDTOResponse c = null; 
		

		for (Cliente cliente :clienteRepository.findAll()) {
			c = new ClienteDTOResponse();
			
			c.setIdClienteDTO(cliente.getIdCliente());
			c.setNombreDTO(cliente.getNombre());
			c.setDireccionDTO(cliente.getDireccion());
			c.setDniDTO(cliente.getDni());
			
			lista.add(c);
			
		}
		
		return lista;
	}

	@Override
	public ClienteDTOResponse obtenerClienteId(Integer id) {
		
		Cliente cliente=clienteRepository.findById(id).orElse(null);
		ClienteDTOResponse	c = new ClienteDTOResponse();
		
		c.setIdClienteDTO(cliente.getIdCliente());
		c.setNombreDTO(cliente.getNombre());
		c.setDireccionDTO(cliente.getDireccion());
		c.setDniDTO(cliente.getDni());
		return c;
	}

}

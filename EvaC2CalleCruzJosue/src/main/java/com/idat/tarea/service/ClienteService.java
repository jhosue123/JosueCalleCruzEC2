package com.idat.tarea.service;

import java.util.List;

import com.idat.tarea.dto.ClienteDTORequest;
import com.idat.tarea.dto.ClienteDTOResponse;

public interface ClienteService {
	
	public void guardarCliente(ClienteDTORequest cliente);
	public void editarCliente(ClienteDTORequest cliente);
	
	public void eliminarCliente(Integer id);
	
	public List<ClienteDTOResponse> listarClientes();
	public ClienteDTOResponse obtenerClienteId(Integer id);
}

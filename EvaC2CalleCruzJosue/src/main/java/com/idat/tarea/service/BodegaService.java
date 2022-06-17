package com.idat.tarea.service;

import java.util.List;

import com.idat.tarea.dto.BodegaDTORequest;
import com.idat.tarea.dto.BodegaDTOResponse;



public interface BodegaService {
	public void guardarBodega(BodegaDTORequest bodega);
	public void editarBodega(BodegaDTORequest bodega);
	
	public void eliminarBodega(Integer id);
	
	public List<BodegaDTOResponse> listarBodegas();
	public BodegaDTOResponse obtenerBodegaId(Integer id);

}

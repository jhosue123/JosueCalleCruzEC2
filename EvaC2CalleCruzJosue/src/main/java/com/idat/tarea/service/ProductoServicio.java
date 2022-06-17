package com.idat.tarea.service;

import java.util.List;

import com.idat.tarea.dto.ProductoDTORequest;
import com.idat.tarea.dto.ProductoDTOResponse;



public interface ProductoServicio {

	
	public void guardarProducto(ProductoDTORequest producto);
	public void editarProducto(ProductoDTORequest producto);
	
	public void eliminarProducto(Integer id);
	
	public List<ProductoDTOResponse> listarProductos();
	public ProductoDTOResponse obtenerProductoId(Integer id);
}

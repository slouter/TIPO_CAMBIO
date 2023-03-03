package com.dev.cambio.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dev.cambio.model.TipoCambio;

@Repository
public interface tipocambioImpl {
	
	public List<TipoCambio> findAll();
	
}

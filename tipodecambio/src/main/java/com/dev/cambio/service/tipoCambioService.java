package com.dev.cambio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.dev.cambio.model.TipoCambio;
import com.dev.cambio.repository.ItipoCambioDao;
import com.dev.cambio.repository.tipocambioImpl;

@Service
@Transactional
public class tipoCambioService implements tipocambioImpl {

	//inyeccion de dependencias
	@Autowired
	//tipocambioImpl tipcambio;
	private ItipoCambioDao cambioDao;
	
	//traer el metodo que lista todo
	/*
	 * public List<tipoCambio> listarTipoCambio(){ return tipcambio.findAll(); }
	 */
	@Override
	@Transactional(readOnly = true)
	public List<TipoCambio> findAll(){
		return (List<TipoCambio>) cambioDao.findAll();
	}
	
}

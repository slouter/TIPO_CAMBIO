package com.dev.cambio.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dev.cambio.model.TipoCambio;
import com.dev.cambio.repository.tipocambioImpl;


@RestController
@RequestMapping("/api")
public class tipoCambioController {
	
	@Autowired
	//tipoCambioService cambioService;
	private tipocambioImpl tipocambio;
	
	/*
	 * @GetMapping("/listarCambioporRangos") public ResponseEntity<List<tipoCambio>>
	 * listarCambio(){ List<tipoCambio> tipcambio =
	 * cambioService.listarTipoCambio(); return new
	 * ResponseEntity<List<tipoCambio>>(tipcambio, HttpStatus.OK); }
	 */
	
	@GetMapping("/tipoCambio")
	public List<TipoCambio> index(){
		return tipocambio.findAll();
	}
	
}

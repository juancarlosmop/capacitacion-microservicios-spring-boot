package com.app.usuarios.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoUsuarioController {
	
	@GetMapping("/saludo-usuario")
	public ResponseEntity<?> obtenerConfig(){
		Map<String, String> json = new HashMap<>();
		json.put("saludo", "hola desde Usuario");
		return new ResponseEntity<Map<String, String>>(json, HttpStatus.OK);
	}
}

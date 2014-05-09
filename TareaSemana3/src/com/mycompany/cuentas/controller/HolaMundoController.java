package com.mycompany.cuentas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaMundoController {
	@RequestMapping("/holaMundoSpring")
	public String saludar() {
		System.out.println("Hola mundo Spring Masivo 4.0 by JoeDayz");
		return "holamundo";
	}
}

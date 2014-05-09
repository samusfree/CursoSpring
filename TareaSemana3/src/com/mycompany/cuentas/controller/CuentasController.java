package com.mycompany.cuentas.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.cuentas.dao.CuentaDAO;
import com.mycompany.cuentas.modelo.Cuenta;

@Controller
public class CuentasController {

	@RequestMapping("/form")
	public String verFormulario() {
		return "cuentas/cuenta-add";
	}

	@RequestMapping("/agregarCuenta")
	public String agregarCuenta(Cuenta cuenta) {
		System.out.println("Agregando cuenta " + cuenta.getDescripcion());
		CuentaDAO cuentaDAO = new CuentaDAO();
		cuentaDAO.agregar(cuenta);
		return "cuentas/cuenta-added";
	}

	@RequestMapping("/listarCuentas")
	public String listar(Model mv) {
		CuentaDAO dao = new CuentaDAO();
		List<Cuenta> cuentas = dao.listar();
		mv.addAttribute("cuentas", cuentas);
		return "cuentas/cuenta-list";
	}

	@RequestMapping("/eliminarCuenta")
	public String remove(Cuenta cuenta) {
		CuentaDAO dao = new CuentaDAO();
		dao.eliminar(cuenta);
		return "redirect:listarCuentas";
	}

	@RequestMapping("/muestraCuenta")
	public String muestra(Long id, Model model) {
		CuentaDAO dao = new CuentaDAO();
		model.addAttribute("cuenta", dao.buscarPorId(id));
		return "cuentas/cuenta-show";
	}

	@RequestMapping("/modificarCuenta")
	public String modificar(Cuenta cuenta) {
		CuentaDAO dao = new CuentaDAO();
		dao.modificar(cuenta);
		return "redirect:listarCuentas";
	}
}

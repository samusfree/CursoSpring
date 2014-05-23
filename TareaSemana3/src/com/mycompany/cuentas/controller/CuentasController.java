package com.mycompany.cuentas.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.cuentas.dao.CuentaDAO;
import com.mycompany.cuentas.modelo.Cuenta;

@Controller
public class CuentasController {

	@Autowired
	CuentaDAO cuentaDAO;

	@RequestMapping("/form")
	public String verFormulario() {
		return "cuentas/cuenta-add";
	}

	@RequestMapping("/agregarCuenta")
	public String agregarCuenta(@Valid Cuenta cuenta, BindingResult result) {

		if (result.hasErrors()) {
			return "cuentas/cuenta-add";
		}

		System.out.println("Agregando cuenta " + cuenta.getDescripcion());
		cuentaDAO.agregar(cuenta);
		return "cuentas/cuenta-added";
	}

	@RequestMapping("/listarCuentas")
	public String listar(Model mv) {
		List<Cuenta> cuentas = cuentaDAO.listar();
		mv.addAttribute("cuentas", cuentas);
		return "cuentas/cuenta-list";
	}

	@RequestMapping("/eliminarCuenta")
	public String remove(Cuenta cuenta) {
		cuentaDAO.eliminar(cuenta);
		return "redirect:listarCuentas";
	}

	@RequestMapping("/muestraCuenta")
	public String muestra(Long id, Model model) {
		model.addAttribute("cuenta", cuentaDAO.buscarPorId(id));
		return "cuentas/cuenta-show";
	}

	@RequestMapping("/modificarCuenta")
	public String modificar(Cuenta cuenta) {
		cuentaDAO.modificar(cuenta);
		return "redirect:listarCuentas";
	}

	@RequestMapping("/pagarCuenta")
	public void pagar(Long id, HttpServletResponse response) {
		cuentaDAO.pagar(id);
		response.setStatus(200);
	}

	public void setCuentaDAO(CuentaDAO cuentaDAO) {
		this.cuentaDAO = cuentaDAO;
	}

}

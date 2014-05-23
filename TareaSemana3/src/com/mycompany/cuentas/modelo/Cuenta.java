package com.mycompany.cuentas.modelo;

import java.util.Calendar;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Cuenta {

	private Long id;

	@NotNull(message = "{cuenta.formulario.descripcion.obligatorio}")
	@Size(min = 5, message = "{cuenta.formulario.descripcion.tamanho}")
	private String descripcion;

	private boolean pago;

	@DecimalMin(value="0",message="{cuenta.formulario.valor.obligatorio}")
	private double valor;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Calendar fechaPago;

	private TipoDeCuenta tipo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Calendar getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Calendar fechaPago) {
		this.fechaPago = fechaPago;
	}

	public TipoDeCuenta getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeCuenta tipo) {
		this.tipo = tipo;
	}

}

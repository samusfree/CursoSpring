package com.samussoft.naturalezabeans.impl;

import com.samussoft.naturalezabeans.Ejercicio4;

public class Ejercicio4Impl implements Ejercicio4 {
	private Integer cantidad;

	public void setCantidadEnDestroy() {
		this.cantidad = 23;
	}

	@Override
	public Integer getCantidad() {
		return this.cantidad;
	}

	@Override
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}

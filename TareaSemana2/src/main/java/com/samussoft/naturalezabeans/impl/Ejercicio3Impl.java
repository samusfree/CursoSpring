package com.samussoft.naturalezabeans.impl;

import org.springframework.beans.factory.DisposableBean;

import com.samussoft.naturalezabeans.Ejercicio3;

public class Ejercicio3Impl implements Ejercicio3, DisposableBean {
	private Integer cantidad;

	@Override
	public void destroy() throws Exception {
		cantidad = 15;
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

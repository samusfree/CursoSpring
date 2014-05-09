package com.samussoft.naturalezabeans.impl;

import org.apache.log4j.Logger;

import com.samussoft.naturalezabeans.Ejercicio2;

public class Ejercicio2Impl implements Ejercicio2 {
	Logger log = Logger.getLogger(getClass());
	Integer suma;

	@Override
	public void init() {
		log.info("Me inicie");
		suma = new Integer(12 + 12);
	}

	@Override
	public Integer getSuma() {
		return this.suma;
	}

	@Override
	public void setSuma(Integer cantidad) {
		this.suma = cantidad;
	}
}

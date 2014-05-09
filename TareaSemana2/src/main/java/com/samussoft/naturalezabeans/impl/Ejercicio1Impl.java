package com.samussoft.naturalezabeans.impl;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;

import com.samussoft.naturalezabeans.Ejercicio1;

public class Ejercicio1Impl implements Ejercicio1 {
	Logger log = Logger.getLogger(getClass());
	private Integer suma;
	@PostConstruct
	public void init() {
		log.info("Comenzo el ciclo de vida del bean Ejercicio1 y el timestamp del servidor es "
				+ new Date());
		suma = 16+24;
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

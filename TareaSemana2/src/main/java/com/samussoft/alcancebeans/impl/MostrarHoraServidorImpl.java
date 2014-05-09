package com.samussoft.alcancebeans.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.log4j.Logger;

import com.samussoft.alcancebeans.MostrarHoraServidor;

public class MostrarHoraServidorImpl implements MostrarHoraServidor {

	Logger log = Logger.getLogger(getClass());

	public void mostrarHora() {
		Calendar objCalendario = Calendar.getInstance();
		SimpleDateFormat objFormateador = new SimpleDateFormat("hh:mm:ss a");
		log.info("La hora actual del servidor es : "
				+ objFormateador.format(objCalendario.getTime()));
	}
}
